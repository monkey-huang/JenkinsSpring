package com.example.JenkinsSpring.model;

public class Product {
	private String Id;
	
	private String name;

	public Product() {}
	
	public Product(String id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
