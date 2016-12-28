package com.teja.jsf.hello;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="sThree")
public class StudentThree {

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
	public String getFavLang() {
		return favLang;
	}
	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}
	
	public StudentThree(){
		
	}
	
	private String firstName;
	private String lastName;
	private String favLang;
	
}
