package dto;

import java.util.List;

public class JobRequestDTO {

	private Integer page;
	private Boolean descending;
	private List<String> companyFilter;
	private List<String> categoryFilter;
	private List<String> levelFilter;
	private List<String> locationFilter;
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Boolean getDescending() {
		return descending;
	}
	public void setDescending(Boolean descending) {
		this.descending = descending;
	}
	public List<String> getCompanyFilter() {
		return companyFilter;
	}
	public void setCompanyFilter(List<String> companyFilter) {
		this.companyFilter = companyFilter;
	}
	public List<String> getCategoryFilter() {
		return categoryFilter;
	}
	public void setCategoryFilter(List<String> categoryFilter) {
		this.categoryFilter = categoryFilter;
	}
	public List<String> getLevelFilter() {
		return levelFilter;
	}
	public void setLevelFilter(List<String> levelFilter) {
		this.levelFilter = levelFilter;
	}
	public List<String> getLocationFilter() {
		return locationFilter;
	}
	public void setLocationFilter(List<String> locationFilter) {
		this.locationFilter = locationFilter;
	}
	
	
}
