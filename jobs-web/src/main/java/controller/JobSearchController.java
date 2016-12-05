package controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dto.JobRequestDTO;
import dto.JobResultDTO;
import service.JobSearchService;

@Controller
public class JobSearchController {

	private final Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	JobSearchService jobSearchService;
	
	@RequestMapping(value = "/searchJobs", method = RequestMethod.POST)
	public String submitJobSearch(Model model, 
			@ModelAttribute("jobSearchRequest") @Validated JobRequestDTO jobSearchRequest,
			BindingResult result) {
	
		try {
			JobResultDTO jobResultDTO = jobSearchService.getJobSearchResults(jobSearchRequest);
			model.addAttribute("jobSearchResult", jobResultDTO);
		} catch (Exception e) {
			logger.error(e.getMessage());
			model.addAttribute(e.getMessage());
			return "errors/generic_error";
		}
		return "jobresult";
	}
	
	@RequestMapping(value = "/search")
	public String search(Model model) {
		return "search";
	}
}
