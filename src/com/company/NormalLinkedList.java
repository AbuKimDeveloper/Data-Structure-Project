package com.company;

public class NormalLinkedList {
	Node first;

	public NormalLinkedList() {

	}

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public void insertAtBack(int i) {
		Node n = new Node(i);
		Node current = first;
		if (!(isEmpty())) {
			while (current.next != null) {
				current = current.next;
			}
			current.next = n;
		} else {
			first = n;
		}
	}

	public boolean Search(int i) {
		if (!(isEmpty())) {
			Node current = first;
			if (current.value == i) {
				return true;
			}
			while (current != null) {
				if (current.value == i) {
					return true;
				}
				current = current.next;
			}
			return false;

		}
		return false;
	}

	public int SearchValueAtIndex(int ans, NormalLinkedList L) {
		int counter = 1;
		Node current = L.first;
		while (counter != ans) {
			current = current.next;
			counter++;
		}
		return current.value;
	}

	public int Grading(int ans, NormalLinkedList L, int b) {
		int a = SearchValueAtIndex(ans, L);
		if (a == b) {
			return 10;
		}

		return 0;
	}


	public void clearLinkedList() {
		first = null;
	}

}
