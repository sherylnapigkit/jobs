package util;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vo.JobSearchResult;

public class JsonToJobsMapper {
	
	private static final Logger logger = LogManager.getLogger(JsonToJobsMapper.class);
	
	public static JobSearchResult mapJobSearchResult(String json) {
		JobSearchResult jobSearchResult = new JobSearchResult();
		
		try {
			jobSearchResult = new ObjectMapper().readValue(json, JobSearchResult.class);
		} catch (JsonMappingException jme) {
			logger.error("Error when mapping json: ", jme.getCause());
		} catch (JsonParseException jse) {
			logger.error("Error when parsing json: ", jse.getCause());
		} catch (Exception e) {
			logger.error("Generic error in mapJobSearchResult: ", e.getCause());
		}
		return jobSearchResult;
	}

}
