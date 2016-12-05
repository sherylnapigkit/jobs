package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import coreservice.JobService;
import dto.JobRequestDTO;
import dto.JobResultDTO;

@Component
public class JobSearchService {

	@Autowired
	JobService jobService;
	
	public JobResultDTO getJobSearchResults(JobRequestDTO jobRequestDTO) {
		return null;
		//return processSearchRequest(jobRequestDTO);
	}
	
//	private JobResultDTO processSearchRequest(JobRequestDTO jobRequestDTO) {
//		FilterRequest filterRequest = createFilterRequest(jobRequestDTO);
//		JobSearchResult jobSearchResult = jobService.searchJobsbyFilters(filterRequest);
//		JobResultDTO jobResultDTO = convertJobResults(jobSearchResult);
//		return jobResultDTO;
//	}
//	
//	private JobResultDTO convertJobResults(JobSearchResult jobSearchResult) {
//		JobResultDTO jobResultDTO = new JobResultDTO();
//		
//		BeanUtils.copyProperties(jobSearchResult, jobResultDTO);
//		List<JobDTO> jobDtos = new ArrayList<JobDTO>();
//		StringBuilder locSb = new StringBuilder();
//		for (Job j : jobSearchResult.getJobList()) {
//			JobDTO jobDTO = new JobDTO();
//			BeanUtils.copyProperties(j, jobDTO);
//			for (Generic g : j.getLocations()) {
//				if (g.getName() != null && !g.getName().isEmpty()) {
//					locSb.append(g.getName()).append(", ");
//				}
//			}
//			jobDTO.setLocations(locSb.toString().substring(0, locSb.length()-1));
//			jobDtos.add(jobDTO);
//		}
//		jobResultDTO.setJobs(jobDtos);
//		
//		return jobResultDTO;
//	}
//	
//	private FilterRequest createFilterRequest(JobRequestDTO jobRequestDTO) {
//		List<Filter> filterList = new ArrayList<Filter>();
//		Filter companyFilter = createFilter(jobRequestDTO.getCompanyFilter(), Constants.FILTER_COMPANY);
//		if (companyFilter != null) {
//			filterList.add(companyFilter);
//		}
//		Filter categoryFilter = createFilter(jobRequestDTO.getCategoryFilter(), Constants.FILTER_CATEGORY);
//		if (categoryFilter != null) {
//			filterList.add(categoryFilter);
//		}
//		Filter levelFilter = createFilter(jobRequestDTO.getLevelFilter(), Constants.FILTER_LEVEL);
//		if (levelFilter != null) {
//			filterList.add(levelFilter);
//		}
//		Filter locationFilter = createFilter(jobRequestDTO.getLocationFilter(), Constants.FILTER_LOCATION);
//		if (locationFilter != null) {
//			filterList.add(locationFilter);
//		}
//		
//		FilterRequest filterRequest = new FilterRequest();
//		BeanUtils.copyProperties(jobRequestDTO, filterRequest);
//		filterRequest.setFilterList(filterList);
//		return filterRequest;
//	}
//	
//	private Filter createFilter(List<String> filterValues, String filterType) {
//		if (filterType == null || filterValues.isEmpty()) {
//			return null;
//		}
//		Filter filter = new Filter();
//		filter.setFilterType(filterType);
//		
//		List<String> encodedValues = new ArrayList<String>();
//		for (String s : filterValues) {
//			try {
//				encodedValues.add(URLEncoder.encode(s, "UTF-8"));
//			} catch (UnsupportedEncodingException e) {
//				e.printStackTrace();
//			}
//		}
//		filter.setFilterValues(encodedValues);
//		
//		return filter;
//	}
	
	
}
