package com.company;

public class ListOfStudentAttempts {
	StudentAttempts first;
//LinkedList bi alba stack betsayiv l tlemiz li 3emlo l exam bi kel categorie
	public void insertStackAtBack(StudentAttempts U) {
		if (!(isEmpty())) {

			StudentAttempts current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = U;
		} else {

			first = U;
		}
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public StudentAttempts SearchStack(int c) {
		int counter = 1;
		StudentAttempts current = first;
		while (counter != c) {
			current = current.next;
			counter++;
		}
		return current;
	}

}
