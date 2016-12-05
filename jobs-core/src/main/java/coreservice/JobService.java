package coreservice;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import util.Constants;
import util.PropertyUtil;
import vo.Filter;
import vo.FilterRequest;
import vo.JobSearchResult;

@Component
public class JobService {
	private static Logger logger = Logger.getLogger(JobService.class);
	
	/*public static void main (String args[]) {
		JobService js = new JobService();
		FilterRequest filterRequest = new FilterRequest();
		
		Filter companyFilter = new Filter();
		companyFilter.setFilterType(Constants.FILTER_COMPANY);
		List<String> filterVals = new ArrayList<String>();
		filterVals.add("Facebook");
		companyFilter.setFilterValues(filterVals);
		
		filterRequest.addFilter(companyFilter);
		
		JobSearchResult result = js.searchJobsbyFilters(filterRequest);
		
		System.out.println(result.toString());
	}*/
	
	public JobSearchResult searchJobsbyFilters(FilterRequest filterRequest) {
		
		String uri = processFilters(filterRequest);
		return retrieveJobSearchResult(uri);		
	}
	
	private JobSearchResult retrieveJobSearchResult(String uri) {
		JobSearchResult jobSearchResult = new JobSearchResult();
		
		RestTemplate rt = new RestTemplate();
		jobSearchResult = rt.getForObject(uri, JobSearchResult.class);
		/*ResponseEntity<String> response = rt.getForEntity(uri, String.class);
		int responseCode = response.getStatusCodeValue();
		String body = response.getBody();
		jobSearchResult = JsonToJobsMapper.mapJobSearchResult(body);
		jobSearchResult.setResponseCode(responseCode);*/
		return jobSearchResult;
	}
	
	private String processFilters(FilterRequest filterRequest) {
		String uri = PropertyUtil.getProperty("jobs");
		 if (uri == null || uri.trim().isEmpty()) {
			 return null;
		 }
		 return generateUriFromFilters(uri, filterRequest);
	}
	
	private String generateUriFromFilters(String baseUri, FilterRequest filterRequest) {
		StringBuilder sb = new StringBuilder();
		sb.append(baseUri);
		sb.append("page=").append(filterRequest.getPageNo());
		if (filterRequest.getDescending()) {
			sb.append("&").append("descending").append(filterRequest.getDescending());				
		}
		for (Filter filter : filterRequest.getFilterList()) {
			if (filter != null && isValidFilterType(filter.getFilterType()) 
					&& !filter.getFilterValues().isEmpty()) {
				sb.append(filter.toString());					
			}
		}
		return sb.toString();
	}
	
	private boolean isValidFilterType(String filterType) {
		return filterType.equals(Constants.FILTER_COMPANY) ||
				filterType.equals(Constants.FILTER_CATEGORY) ||
				filterType.equals(Constants.FILTER_LEVEL) ||
				filterType.equals(Constants.FILTER_LOCATION);
	}
	 

}
