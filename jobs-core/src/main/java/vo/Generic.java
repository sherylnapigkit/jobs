package vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Generic {
	String name;
	@JsonProperty("short_name")
    String shortName;
	
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
