package com.sks;

import java.util.Set;

public class Employee {

	private String empName;
	private Address address;
	private String id;
	private Set<String> projects;
	
	public Employee(String empName, Address address, String id, Set<String> projects) {
		super();
		this.empName = empName;
		this.address = address;
		this.id = id;
		this.projects = projects;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	
	

}
