package com.teja.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="sFour")
public class StudentFour {

	private String firstName;
	private String lastName;
	private String [] favLangs;
	
	public StudentFour(){
		
	}
	
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
	public String[] getFavLangs() {
		return favLangs;
	}
	public void setFavLangs(String[] favLangs) {
		this.favLangs = favLangs;
	}
	
	
}
