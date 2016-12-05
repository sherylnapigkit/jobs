package vo;

import java.util.ArrayList;
import java.util.List;

public class FilterRequest {
	public Integer pageNo = 0;
	public Boolean descending = false;
	public List<Filter> filterList = new ArrayList<Filter>();
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Boolean getDescending() {
		return descending;
	}
	public void setDescending(Boolean descending) {
		this.descending = descending;
	}
	public List<Filter> getFilterList() {
		return filterList;
	}
	public void setFilterList(List<Filter> filterList) {
		this.filterList = filterList;
	}
	
	public void addFilter(Filter filter) {
		filterList.add(filter);
	}
	
	
}
