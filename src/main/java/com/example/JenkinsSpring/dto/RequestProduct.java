package com.example.JenkinsSpring.dto;

public class RequestProduct {
	private String ID;

	public RequestProduct() {}
	
	public RequestProduct(String iD) {
		super();
		ID = iD;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	
}
