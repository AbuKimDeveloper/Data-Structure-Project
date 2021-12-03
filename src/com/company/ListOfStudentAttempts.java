package com.company;
public class ListOfStudentAttempts {
	StudentAttempts first;

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

	public boolean CheckID(int id, int index) {
		boolean checker = false;

		StudentAttempts S = SearchStack(index);
		StudentAttempts temp = new StudentAttempts("temp");
		if (!(S.isEmpty())) {
			while (!S.isEmpty()) {
				Student d1 = new Student();
				d1 = S.pop();
				temp.push(d1.firstName, d1.lastName, d1.Grade, d1.ID);
				if (d1.ID == id)
					checker = true;
			}
			while (!temp.isEmpty()) {
				Student d2 = new Student();
				d2 = temp.pop();
				S.push(d2.firstName, d2.lastName, d2.Grade, d2.ID);
			}
		}
		return checker;
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
		while (counter != c && current != null) {
			current = current.next;
			counter++;
		}
		return current;
	}

	public int sizeOfLL() {
		if (!(isEmpty())) {
			StudentAttempts current = first;
			int counter = 1;
			while (current != null) {
				current = current.next;
				counter++;
			}
			return counter;
		}
		return -1;
	}

	public ListOfStudentAttempts displayShortAnswer() {
		ListOfStudentAttempts ShortAnswer = new ListOfStudentAttempts();
		StudentAttempts Q = first;
		int counter = 1;
		while (Q != null) {
			if (Q.ShortAnswer == true) {
				System.out.println(counter + "-" + Q.Name);
				System.out.println();
				ShortAnswer.insertStackAtBack(Q);
				Q = Q.next;
				counter++;
			} else {
				Q = Q.next;

			}
		}

		return ShortAnswer;
	}

	public int SearchIndexByStack(StudentAttempts S) {
		if (!isEmpty()) {
			int counter = 1;
			StudentAttempts current = first;
			while (current != S) {
				current = current.next;
				counter++;
			}
			return counter;
		}
		return -1;
	}

	public boolean display() {
		if (!isEmpty()) {
			StudentAttempts Q = new StudentAttempts("Q");
			Q = first;
			int counter = 1;
			while (Q != null) {
				System.out.println(counter + "-" + Q.Name);
				System.out.println();
				Q = Q.next;
				counter++;
			}
			return true;
		} else {

			System.out.println("No Short Answer Quiz Attempts!");
			return false;
		}

	}

}
