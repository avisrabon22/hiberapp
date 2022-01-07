package com.webmonster.mapmanytomany;

import java.util.List;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProjectDetails {
	@Id
	private int ProId;
	private String ProName;

	@ManyToMany(mappedBy = "projects"  )
	private List<EmpDetails> employees;

//	*******************************************************************
	public int getProId() {
		return ProId;
	}

	public void setProId(int proId) {
		ProId = proId;
	}

	public String getProName() {
		return ProName;
	}

	public void setProName(String proName) {
		ProName = proName;
	}

	public List<EmpDetails> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmpDetails> employees) {
		this.employees = employees;
	}

	public ProjectDetails(int proId, String proName, List<EmpDetails> employees) {
		super();
		ProId = proId;
		ProName = proName;
		this.employees = employees;
	}

	public ProjectDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
