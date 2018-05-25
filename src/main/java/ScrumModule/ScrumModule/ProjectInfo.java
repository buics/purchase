package ScrumModule.ScrumModule;

import java.util.List;

import org.springframework.data.annotation.Id;

public class ProjectInfo {
	
	@Id
	String id;
	String name,description,dateStart;
	List<Sponsor> spronsorList;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateStart() {
		return dateStart;
	}
	public void setDateStart(String dateStart) {
		this.dateStart = dateStart;
	}
	public List<Sponsor> getSpronsorList() {
		return spronsorList;
	}
	public void setSpronsorList(List<Sponsor> spronsorList) {
		this.spronsorList = spronsorList;
	}
	
	
	
	
	
	
	
}
