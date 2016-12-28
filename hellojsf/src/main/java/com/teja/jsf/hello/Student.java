package com.teja.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private String firstName;
	private String lastName;
	
	// no-arg constructro
	public Student(){
		
	}

	// Getters and Setter
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
