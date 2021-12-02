package com.company;

import java.util.Random;
import java.util.Scanner;

public class Category extends LinkedListToQueue {
	String Category;
	Category next;


	public Category(String Category) {
		this.Category = Category;
	}

	public Category() {

	}

	public void enqueue(Question Q) {
		insertAtBack(Q);
	}

	public void enqueue(String Question, String[] choices, int Index) {
		Question Q = new Question(Question, choices, Index);
		insertAtBack(Q);
	}

	Question dequeue() {

		return deleteFromFront();

	}

	public int getQuizSize() { // kermel size lal quiz wa2t badna ntali3 l grade
		if (!isEmpty()) {
			Category Temp = new Category();
			int counter = 0;
			while (!(isEmpty())) {
				Question Q = dequeue();
				Temp.enqueue(Q.Question, Q.choices, Q.IndexOfCorrectAns);
				counter++;
			}

			while (!(Temp.isEmpty())) {
				Question Q = Temp.dequeue();
				enqueue(Q.Question, Q.choices, Q.IndexOfCorrectAns);

			}
			return counter;
		}
		return 0;
	}

	public int CalcGrade() { // hayde bade erja3 shufa
		int Grade = 0;
		int size = getQuizSize();
		Scanner Input = new Scanner(System.in);
		Random random = new Random();
		int Questions[] = new int[10];
		Category Temp = new Category();
		int index = 0;

		NormalLinkedList indices = new NormalLinkedList();
		int counter;
		while (!(isEmpty())) {
			Question current = dequeue();
			Temp.enqueue(current.Question, current.choices, current.IndexOfCorrectAns);
			System.out.println(current.Question);

			counter = 1;
			while (counter <= 4) {
				int i = random.nextInt(4);
				if ((indices.Search(i)) == false) {
					System.out.println(counter + "-" + current.choices[i]);
					counter++;
					indices.insertAtBack(i);
				}
			}
			int answer;
			do {
				System.out.print("Answer(numbers only): ");
				answer = Input.nextInt();
				System.out.println();
			} while (!((answer == 1 || answer == 2 || answer == 3 || answer == 4)));
			Questions[index] = answer;
			index++;
			Grade += Grading(answer, indices, current.IndexOfCorrectAns);
			System.out.println();
			indices.clearLinkedList();

		}

		System.out.println();
		System.out.println();
		System.out.println("Your Grade is: " + Grade + "/" + (size * 10));

		while (!(Temp.isEmpty())) {
			Question Q = Temp.dequeue();
			enqueue(Q.Question, Q.choices, Q.IndexOfCorrectAns);
		}
		return Grade;

	}

}
