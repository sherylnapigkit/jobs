package vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Job {
	Long id;
	@JsonProperty("short_name")
    String shortName;
    String name;
    List<Generic> tags = new ArrayList<Generic>();
    List<Generic> levels = new ArrayList<Generic>();
    List<Generic> locations = new ArrayList<Generic>();
    List<Generic> categories = new ArrayList<Generic>();
    @JsonProperty("refs")
    Map<String, String> refsMap;
    Company company;
    String contents;
    @JsonProperty("publication_date")
    Date publicationDate;
    String type;
    @JsonProperty("model_type")
    String modelType;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Generic> getTags() {
		return tags;
	}
	public void setTags(List<Generic> tags) {
		this.tags = tags;
	}
	public List<Generic> getLevels() {
		return levels;
	}
	public void setLevels(List<Generic> levels) {
		this.levels = levels;
	}
	public List<Generic> getLocations() {
		return locations;
	}
	public void setLocations(List<Generic> locations) {
		this.locations = locations;
	}
	public List<Generic> getCategories() {
		return categories;
	}
	public void setCategories(List<Generic> categories) {
		this.categories = categories;
	}
	public Map<String, String> getRefsMap() {
		return refsMap;
	}
	public void setRefsMap(Map<String, String> refsMap) {
		this.refsMap = refsMap;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModelType() {
		return modelType;
	}
	public void setModelType(String modelType) {
		this.modelType = modelType;
	}
    
    
    
}
