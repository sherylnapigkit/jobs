package vo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobSearchResult {
	@JsonProperty("page_count")
	Integer pageCount;
	@JsonProperty("page")
    Integer currentPage;
	@JsonProperty("total")
    Integer totalCount;
	@JsonProperty("timed_out")
    Boolean timedOut;
	@JsonProperty("took")
    Long runTimeInMs;
	@JsonProperty("results")
    List<Job> jobList = new ArrayList<Job>();
	
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Boolean getTimedOut() {
		return timedOut;
	}
	public void setTimedOut(Boolean timedOut) {
		this.timedOut = timedOut;
	}
	public Long getRunTimeInMs() {
		return runTimeInMs;
	}
	public void setRunTimeInMs(Long runTimeInMs) {
		this.runTimeInMs = runTimeInMs;
	}
	public List<Job> getJobList() {
		return jobList;
	}
	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}
	@Override
	public String toString() {
		return "JobSearchResult [pageCount=" + pageCount + ", currentPage=" + currentPage + ", totalCount=" + totalCount
				+ ", timedOut=" + timedOut + ", runTimeInMs=" + runTimeInMs + ", jobList=" + jobList.size() + "]";
	}
	
	

}
