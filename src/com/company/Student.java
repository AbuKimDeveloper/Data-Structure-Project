package com.company;

public class Student extends StudentAttempts {
	String firstName;
	String lastName;
	int Grade;
	int ID;
	Student next;

	Student(String firstName, String lastName, int Grade, int ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Grade = Grade;
		this.ID = ID;
		next = null;

	}
	Student(){

	}

	Student(String firstName, String lastName, int ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		next = null;

	}


}
