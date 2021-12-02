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
	//3mol removeAtIndexLa yma7e l categorie

	public Category SearchValueAtIndex(int ans) { //3mela binary search
		int counter = 1;
		Category current = first;
		while (counter != ans) {
			current = current.next;
			counter++;
		}
		return current;
	}
	void deleteAtIndex(int index){
		Category node=SearchValueAtIndex(index);
		if (!isEmpty()){
			Category current = first;
			Category previous = first;
			while (current!=node){
				previous = current;
				current = current.next;
			}
			previous.next=current.next;
		}
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


	public static boolean CheckCategories(String category){
		Category current = first;
		while (current!=null){
			if (category.equals(current.Category)) {
				System.out.println("This Category is taken\nEnter another name");
				return true;
			}
			current=current.next;
		}
		return false;
	}

	public void display() {
		Category Q = first;
		while (Q != null) {
			System.out.println(Q.Category);
			Q = Q.next;
		}
	}

}
