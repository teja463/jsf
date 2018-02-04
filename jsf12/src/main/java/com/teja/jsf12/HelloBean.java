package com.teja.jsf12;

public class HelloBean {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Setting name" + name);
	}
	

	public String sayHello(){
		System.out.println("In say hello");
		return "success";
	}
}
