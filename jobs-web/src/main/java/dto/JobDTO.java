package dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import vo.Generic;


public class JobDTO {
	
	Long id;
	String shortName;
    String name;
    List<Generic> tags = new ArrayList<Generic>();
    List<Generic> levels = new ArrayList<Generic>();
    List<Generic> categories = new ArrayList<Generic>();    
    Map<String, String> refsMap;
    String companyLongName;
    String companyShortName;
    String contents;    
    Date publicationDate;
    String type;
    String modelType;
    String locations;
    
    
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
	public String getCompanyLongName() {
		return companyLongName;
	}
	public void setCompanyLongName(String companyLongName) {
		this.companyLongName = companyLongName;
	}
	public String getCompanyShortName() {
		return companyShortName;
	}
	public void setCompanyShortName(String companyShortName) {
		this.companyShortName = companyShortName;
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
	public String getLocations() {
		return locations;
	}
	public void setLocations(String locations) {
		this.locations = locations;
	}
    
    

}
