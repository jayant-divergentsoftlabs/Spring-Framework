package com.divergent.service;

/**
 * Employee class with Setter-based dependency injection
 * 
 * @author Jayant
 *
 */
public class Employee {
	private int id;
	private String name;
	private String number;

	public void setId(int id) {
		this.id = id;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + id + name + number);
	}
}
