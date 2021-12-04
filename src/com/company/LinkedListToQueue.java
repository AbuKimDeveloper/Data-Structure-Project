package com.company;
public class LinkedListToQueue {
	private Question first;
	private String Name;

	public LinkedListToQueue(String S) {
		first = null;
		Name = S;
	}

	public LinkedListToQueue() {
		first = null;
		Name = null;
	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public void insertAtBack(Question q) {

		if (!(isEmpty())) {
			Question current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = q;
		} else {
			first = q;
			q.next = null;
		}
	}

	public Question deleteFromFront() {
		if (!(isEmpty())) {
			Question Q = first;
			first = first.next;
			return Q;
		}

		System.out.println("No Questions in this category!");
		return null;
	}

	public void deleteFromIndex(int i) {
		Question current = first;
		Question previous = first;
		for (int j = 1; j < i; j++) {
			previous = current;
			current = current.next;
		}
		previous.next = current.next;
	}

	public boolean Search(int i) {
		if (!(isEmpty())) {
			Question current = first;
			if (current.data == i) {
				return true;
			}
			while (current != null) {
				if (current.data == i) {
					return true;
				}
				current = current.next;
			}
			return false;

		}
		return false;
	}

	public void displayLinkedList() {
		Question current = first;
		if (!(isEmpty())) {
			System.out.println(current.data);
			current = current.next;
			while (current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}

	public int SearchValueAtIndex(int ans, NormalLinkedList indices) {
		int counter = 1;
		Node current = indices.first;
		while (counter != ans) {
			current = current.next;
			counter++;
		}
		return current.value;
	}

	public int Grading(int ans, NormalLinkedList indices, int b) {
		int a = SearchValueAtIndex(ans, indices);
		if (a == b) {
			return 10;
		}

		return 0;
	}

	public void clearLinkedList() {
		first = null;
	}

}
