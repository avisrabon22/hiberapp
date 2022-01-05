package com.webmonster.mapmanytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class EmpDetails {
	@Id
	private int empID; 
	private String empName;
	
	@ManyToMany
	private List<ProjectDetails> projects;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public List<ProjectDetails> getProjects() {
		return projects;
	}
	public void setProjects(List<ProjectDetails> projects) {
		this.projects = projects;
	}
	
	public EmpDetails(int empID, String empName, List<ProjectDetails> projects) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.projects = projects;
	}
	public EmpDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
