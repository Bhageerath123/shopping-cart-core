package com.niit.shoppingcartcore;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private String id;
    private String name;
    private String descrption;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
		
	}
	private String description;
    
}
