package com.divergent.service;
/**
 * Student Class with Constructor-based dependency injection
 * @author Jayant
 *
 */
public class StudentConstructor {
 private int id;
 private String name;
 private String Address;
public StudentConstructor(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	Address = address;
}
public void method() {

System.out.println(+id+ " " +name+ " " +Address);
}
	
}
