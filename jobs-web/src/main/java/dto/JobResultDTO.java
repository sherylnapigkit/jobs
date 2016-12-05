package dto;

import java.util.List;

public class JobResultDTO {

	Integer pageCount;
	Integer currentPage;
	Integer totalCount;
	Boolean timedOut;
	Long runTimeInMs;
	List<JobDTO> jobs;
	
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
	public List<JobDTO> getJobs() {
		return jobs;
	}
	public void setJobs(List<JobDTO> jobs) {
		this.jobs = jobs;
	}
	
	
	
}
