package com.Aiden.domain;

import java.util.List;

public class Company {
	private Integer id;
	private String companyName;
	private List<Person> persons;
	public Company() {
		super();
	}
	public Company(String companyName) {
		super();
		this.companyName = companyName;
	}
	public Company(Integer id, String companyName) {
		super();
		this.id = id;
		this.companyName = companyName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public List<Person> getPersons() {
		return persons;
	}
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + "]";
	}
	

}
