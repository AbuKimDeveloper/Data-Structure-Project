package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
	static String S = "";

	void display(ListOfCategories qHolder, ListOfStudentAttempts sHolder) {
		Scanner console = new Scanner(System.in);
		System.out.println(
				"\t\t\t\tQUIZ APPLICATION\n\t\t\t     -----------------------\n\t\t\t     -----------------------");
		System.out.println("Welcome to the quiz application");
		int option = 0;
		int Answer = 0;

		while (Answer != 1 && Answer != 2) {
			try {
				System.out.println("Please Choose From The Below Menu\n\n1-Student\n\n2-Teacher");
				System.out.println("---------------------------");
				Answer = console.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid number");
				console.next();
			}
		}

		if (Answer == 2) {
			while (option != 2 && option != 1 && option != 3 && option != 4 && option != 5) {
				try {
					System.out.println("1-Create a Category\n ");
					System.out.println("2-Check the Grades\n");
					System.out.println("3-Delete a Category\n");
					System.out.println("4-Correct Short Answer Exams\n");
					System.out.println("5-Return to Main Menu\n");
					option = console.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Please enter a valid number");
					console.next();
				}

			}

			if (option == 1) {
				System.out.println(
						"Quiz Type:\n\n1-MCQ Quiz(Automatic Correction)\n\n2-Short Answer Quiz(Manual Correction)");
				int res = console.nextInt();
				if (res == 1) {
					char ans = ' ';
					System.out.println("Please enter the name of the new Category");
					console.nextLine();
					String name = console.nextLine();
					boolean check = qHolder.CheckCategories(name);
					while (check) {
						System.out.println("This Category name is taken\nEnter another name");

						name = console.nextLine();
						check = qHolder.CheckCategories(name);
					}

					Category NewCat = new Category(name);

					StudentAttempts NewStack = new StudentAttempts(name);
					int counter = 1;
					do {

						System.out.println("Please Enter Question " + (counter));
						if (counter > 1) {
							console.nextLine();
						}

						String question = console.nextLine();
						String choices[] = new String[4];

						System.out.println("What are the 4 choices that you want to enter for question => " + question);
						for (int j = 0; j < 4; j++) {
							System.out.println("Enter choice " + (j + 1));

							String choice = console.nextLine();
							choices[j] = choice;

						}

						System.out.println("Enter the index of the correct answer");
						int correctAnswer = console.nextInt();
						do {
							if (correctAnswer > 4 || correctAnswer < 1) {
								System.out.println("Enter number between 1 and 4");
								correctAnswer = console.nextInt();
							}
						} while (correctAnswer > 4 || correctAnswer < 1);
						correctAnswer--;
						NewCat.enqueue(question, choices, correctAnswer);
						System.out.println("Would you like to add another question?(y/n)");
						ans = console.next().charAt(0);
						ans = Character.toUpperCase(ans);
						counter++;
					} while (ans == 'Y');
					qHolder.insertAtBack(NewCat);
					sHolder.insertStackAtBack(NewStack);
					returnToMenu(qHolder, sHolder);
				} else if (res == 2) {

					char ans = ' ';
					System.out.println("Please enter the name of the new Category");
					console.nextLine();
					String name = console.nextLine();
					boolean check = qHolder.CheckCategories(name);
					while (check) {
						System.out.println("This Category name is taken\nEnter another name");

						name = console.nextLine();
						check = qHolder.CheckCategories(name);
					}

					Category NewCat = new Category(name);

					StudentAttempts NewStack = new StudentAttempts(name);
					int counter = 1;
					do {

						System.out.println("Please Enter Question " + (counter));
						if (counter > 1) {
							console.nextLine();
						}

						String question = console.nextLine();

						NewCat.enqueue(question);
						System.out.println("Would you like to add another question?(y/n)");
						ans = console.next().charAt(0);
						counter++;
					} while (ans == 'y');

					NewCat.setShortAnswer(true);
					qHolder.insertAtBack(NewCat);
					NewStack.ShortAnswer = true;
					sHolder.insertStackAtBack(NewStack);
					returnToMenu(qHolder, sHolder);

				}
			}

			else if (option == 2) {

				System.out.println("\nPlease enter an index to view student attempts history ");
				qHolder.display();
				System.out.println("---------------------------");

				Scanner Input = new Scanner(System.in);
				int a = Input.nextInt();
				StudentAttempts S = sHolder.SearchStack(a);
				System.out.println(
						"To delete any attempt, enter the index of the attempt(Top to Bottom)\n Or enter 0 to exit");
				System.out.println("---------------------------");

				if (!S.display()) {
					returnToMenu(qHolder, sHolder);
				} else {
					int ans = Input.nextInt();
					if ((ans == 0) || !(ans > 0 && ans < sHolder.sizeOfLL())) {
						System.out.println("Entered index is not found!");
						returnToMenu(qHolder, sHolder);
					} else {
						if (S.deleteStudentRecordByIndex(ans)) {
							System.out.println("Record deleted succesfully");
							S.display();
							returnToMenu(qHolder, sHolder);
						} else {

						}
					}
				}

			} else if (option == 3) {

				qHolder.display();
				System.out.println("Please enter the index of the category you want to delete");
				int category = 1;
				do {
					if (category <= 0 || category > qHolder.sizeOfLL()) {
						System.out.println("Enter a valid index!\n");
					}
					category = console.nextInt();
				} while (category <= 0 || category > qHolder.sizeOfLL());
				if (qHolder.deleteAtIndex(category)) {
					System.out.println("Deleted Succesfully! :\n");
					qHolder.display();
				} else {
					System.out.println("Error! Could not delete category");

					returnToMenu(qHolder, sHolder);
				}
			}

			else if (option == 4) {

				System.out.println("\nPlease enter an index to view SHORT ANSWER student attempts history ");
				sHolder.display();
				Scanner Input = new Scanner(System.in);
				int a = Input.nextInt();
				StudentAttempts S = sHolder.SearchStack(a);
				S.CorrectQuizzes();
				returnToMenu(qHolder, sHolder);

			}

			else if (option == 5) {
				returnToMenu(qHolder, sHolder);
			}

		} else if (Answer == 1)

		{
			quizAttempt(qHolder, sHolder, S);
		}

	}

	public void quizAttempt(ListOfCategories qHolder, ListOfStudentAttempts sHolder, String S) {
		Scanner Input = new Scanner(System.in);
		Actions(qHolder, sHolder, S);
		returnToMenu(qHolder, sHolder);
	}

	public void Actions(ListOfCategories qHolder, ListOfStudentAttempts sHolder, String S) {
		int a = 0;
		Scanner Input = new Scanner(System.in);
		while (!(a > 0 && a <= qHolder.sizeOfLL())) {
			try {

				System.out.println(
						"---------------------------\n\nPlease enter the index of a category start answering the quiz questions:\n");
				qHolder.display();
				System.out.println("---------------------------");
				a = Input.nextInt();

			} catch (InputMismatchException e) {

			}
		}
		System.out.println("Enter your ID : \n");

		int Id = Input.nextInt();

		System.out.println("Enter your first name: \n");
		String FName = Input.next();
		System.out.println("Enter your last name: \n");
		String LName = Input.next();

		boolean check = sHolder.CheckID(Id, a);
		StudentAttempts Current;
		Current = sHolder.SearchStack(a);
		if (check) {
			System.out.println();
			System.out.println("You can't attempt the same quiz twice");
			System.out.println();
			Actions(qHolder, sHolder, S);
		}
		System.out.println("---------------------------");
		if (qHolder.SearchValueAtIndex(a).isShortAnswer() == false) {
			int Grade = qHolder.SearchValueAtIndex(a).calcGrade();
			Current.push(FName, LName, Grade, Id);
		} else {
			Category C = qHolder.SearchValueAtIndex(a);
			String[] ShortAnswers = new String[C.getQuizSize2()];
			Category Temp = new Category();
			int counter = 0;
			while (!(C.isEmpty())) {
				Question current = C.dequeue();

				System.out.println(current.Question);
				System.out.println("Note:Press \"Enter\" to input your answer: ");
				if (counter == 0) {
					Input.nextLine();
				}
				ShortAnswers[counter] = Input.nextLine();

				counter++;

				Temp.enqueue(current.Question);
				System.out.println("---------------------------");

			}
			Current.push(FName, LName, -1, Id, ShortAnswers);
			while (!(Temp.isEmpty())) {
				Question Q = Temp.dequeue();
				C.enqueue(Q.Question);

			}

		}
	}

	public void returnToMenu(ListOfCategories qHolder, ListOfStudentAttempts sHolder) {
		Scanner Input = new Scanner(System.in);
		System.out.println("Would you like to return to main menu?(y or n)");
		char ans = Input.next().charAt(0);
		ans = Character.toUpperCase(ans);
		if (ans == 'Y') {
			display(qHolder, sHolder);
		}
	}
}
