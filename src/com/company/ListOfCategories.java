package com.company;
public class ListOfCategories {
	static Category first;
	String Name;

	public ListOfCategories() {
		first = null;
		Name = null;
	}

	public void insertAtFront(Category Q) {
		Q.next = first;
		first = Q;
	}

	public void insertAtBack(Category Q) {

		if (!(isEmpty())) {
			Category current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = Q;
		} else {
			first = Q;
		}
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public Category SearchValueAtIndex(int ans) {
		int counter = 1;
		Category current = first;
		while (counter != ans) {
			current = current.next;
			counter++;
		}
		return current;
	}

	boolean deleteAtIndex(int index) {
		Category delete = SearchValueAtIndex(index);
		if (!isEmpty()) {
			if (index == 1) {
				first = first.next;
				return true;
			}
			Category current = first;
			Category previous = first;
			while (current != delete && current != null) {
				previous = current;
				current = current.next;
			}
			if (current != null) {
				previous.next = current.next;
				return true;
			}
		}
		System.out.println("No Quizzes to delete!");
		return false;
	}

	public int sizeOfLL() {
		if (!(isEmpty())) {
			Category current = first;
			int counter = 1;
			while (current != null) {
				current = current.next;
				counter++;
			}
			return counter;
		}
		return -1;
	}

	public int getIndex(Category Q) {
		int counter = 1;
		Category current = first;
		while (current != Q && counter <= sizeOfLL()) {
			current = current.next;
			counter++;
		}
		return counter;
	}

	public static boolean CheckCategories(String category) {
		Category current = first;
		while (current != null) {
			if (category.equals(current.Category)) {

				return true;
			}
			current = current.next;
		}
		return false;
	}

	public void display() {
		Category Q = first;
		int counter = 1;
		while (Q != null) {
			System.out.println(counter + "-" + Q.Category);
			System.out.println();
			Q = Q.next;
			counter++;
		}
	}

}
