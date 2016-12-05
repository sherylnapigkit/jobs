package vo;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    public String filterType;
    public List<String> filterValues = new ArrayList<String>();

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public List<String> getFilterValues() {
        return filterValues;
    }

    public void setFilterValues(List<String> filterValues) {
        this.filterValues = filterValues;
    }

    public void addFilterValue(String value) {
        filterValues.add(value);
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (String filterVal : getFilterValues()) {
			sb.append("&").append(getFilterType()).append("=").append(filterVal);
		}
		
		return sb.toString();
	}
    
    
}
