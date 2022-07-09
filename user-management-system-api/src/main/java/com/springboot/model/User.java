package com.springboot.model;

public class User {
	
	private long id;
	private String FirstName;
	private String lastName;
	private String emailId;
	
	public User() {
		
	}

	public User(long id, String firstName, String lastName, String emailId) {
	
		this.id = id;
		FirstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
	
	
	

}
