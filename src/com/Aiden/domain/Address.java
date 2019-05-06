package com.Aiden.domain;

public class Address {
	
	private Integer id;
	private String country;
	private String city;
	private String district;
	public Address() {
		super();
	}
	public Address(String country, String city, String district) {
		super();
		this.country = country;
		this.city = city;
		this.district = district;
	}
	public Address(Integer id, String country, String city, String district) {
		super();
		this.id = id;
		this.country = country;
		this.city = city;
		this.district = district;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", city=" + city + ", district=" + district + "]";
	}
	
	

}
