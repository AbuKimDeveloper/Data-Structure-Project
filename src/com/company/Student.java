package com.company;
public class Student {
	public String firstName;
	public String lastName;
	public int Grade;
	public int ID;
	public Student next;
	public String[] ShortAnswers = new String[10];

	Student(String firstName, String lastName, int Grade, int ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Grade = Grade;
		this.ID = ID;
		next = null;

	}

	Student(String firstName, String lastName, int Grade, int ID, String[] ShortAnswers) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.Grade = Grade;
		this.ID = ID;
		this.ShortAnswers = ShortAnswers;
		next = null;

	}

	Student() {
		next = null;
	}

	Student(String firstName, String lastName, int ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
		next = null;

	}

}
