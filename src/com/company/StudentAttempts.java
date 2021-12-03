package com.company;
import java.util.Scanner;

public class StudentAttempts {
	boolean ShortAnswer = false;
	Student first;
	StudentAttempts next;
	String Name;

	public void push(String FName, String LName, int Grade, int Id) {
		Student NewUser = new Student(FName, LName, Grade, Id);
		if (!(isEmpty())) {
			NewUser.next = first;
			first = NewUser;
		} else {
			first = NewUser;
			next = null;
		}
	}

	public void push(String FName, String LName, int Grade, int Id, String[] ShortAnswers) {
		Student NewUser = new Student(FName, LName, Grade, Id, ShortAnswers);
		if (!(isEmpty())) {
			NewUser.next = first;
			first = NewUser;
		} else {
			first = NewUser;
			next = null;
		}
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public StudentAttempts(String S) {
		first = null;
		Name = S;
	}

	public Student pop() {

		if (!(isEmpty())) {
			Student C = first;
			first = C.next;
			return C;

		}
		System.out.println("No Students Records!");
		return null;

	}

	public Student SearchValueAtIndex(int index) {

		int counter = 1;
		Student current = first;
		while (counter != index) {
			current = current.next;
			counter++;
		}
		return current;

	}

	boolean display() {
		boolean check = true;
		if (!(isEmpty())) {
			StudentAttempts Temp = new StudentAttempts("Temp");

			while (!(isEmpty())) {
				Student C = pop();
				Temp.push(C.firstName, C.lastName, C.Grade, C.ID);
				System.out.println("First Name: " + C.firstName + "		Last Name: " + C.lastName + "\nID: " + C.ID
						+ "		Grade: " + C.Grade + "\n-----------------");
			}
			while (!(Temp.isEmpty())) {
				Student C = Temp.pop();
				push(C.firstName, C.lastName, C.Grade, C.ID);
			}

			check = true;

		} else {
			System.out.println("No Student Records!");
			check = false;
		}

		return check;
	}

	boolean deleteStudentRecordByIndex(int index) {
		StudentAttempts Temp = new StudentAttempts("Temp");
		if (!isEmpty()) {
			int counter = 1;
			Student S = pop();

			while (!isEmpty()) {
				if (counter == index) {

				} else {
					Temp.push(S.firstName, S.lastName, S.Grade, S.ID);
				}
			}

			while (!Temp.isEmpty()) {
				S = Temp.pop();

				push(S.firstName, S.lastName, S.Grade, S.ID);

			}
			return true;

		} else {
			System.out.println("No Student Records to delete");
			return false;
		}
	}

	public void CorrectQuizzes() {
		Scanner Input = new Scanner(System.in);
		StudentAttempts Temp = new StudentAttempts("Temp");

		Student St = pop();

		System.out.println(St.firstName + " " + St.lastName + "//ID: " + St.ID + "\n");
		for (int i = 0; i < St.ShortAnswers.length; i++) {

			System.out.println("Answer of question " + (i + 1) + ": " + St.ShortAnswers[i]);
		}
		System.out.println("Input the grade:");
		int grade = Input.nextInt();
		push(St.firstName, St.lastName, grade, St.ID, St.ShortAnswers);
	}

}