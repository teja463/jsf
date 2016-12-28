package com.teja.jsf.hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="sTwo")
public class StudentTwo {

	private String firstName;
	private String lastName;
	private String country;
	private List<String> countryOptions;
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	// no-arg constructor
	public StudentTwo(){
		System.out.println("Constructor called");
		countryOptions  = new ArrayList<String>();
		countryOptions.add("India");
		countryOptions.add("Russia");
		countryOptions.add("China");
		countryOptions.add("United States");
	}

	// Getters and Setters
	public String getFirstName() {
		System.out.println("returning first name...");
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("setting first name... ");
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
