package org.learn.spring.model;

public class Customer {

	private String firstName;
	private String lastName;

	public Customer() {

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
	
	public String toString(){
		return firstName  + " " + lastName;
	}

}
