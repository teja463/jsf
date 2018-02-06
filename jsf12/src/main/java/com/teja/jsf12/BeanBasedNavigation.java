package com.teja.jsf12;

import java.util.Random;

public class BeanBasedNavigation {

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
		int nextInt = new Random().nextInt(10);
		if( nextInt <3){
			return "success";
		}else{
			return "failure";
		}
	}
}
