package vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {
	Long id;
    String name;
    @JsonProperty("short_name")
    String shortName;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
    
    
}
