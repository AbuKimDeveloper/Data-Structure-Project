package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu {
	static String S = "";


	// qholer linked list of queues
	void display(ListOfCategories qHolder, ListOfStudentAttempts sHolder) {
		Scanner console = new Scanner(System.in);
		System.out.println("Welcome to the quiz application");
		int option=0;
		int Answer=0;



		while (Answer!=1 && Answer!=2) {
			try {
				System.out.println("Please Choose From The Below Menu\n1-Student\n2-Teacher");
				Answer = console.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Please enter a valid number");
				Answer = console.nextInt();
			}
		}

		if (Answer == 2) {
			while (option!=2 && option !=1 && option !=3){
				try {
					System.out.println("1-Create a Category ");
					System.out.println("2-Check the Grades");
					System.out.println("3-Delete a Category");
					option = console.nextInt();
				}catch (InputMismatchException e){
					System.out.println("Please enter a valid number");
					console.next();
				}

			}

			if (option == 1) {
				char ans = ' ';
				System.out.println("Please enter the name of the new Category");

				String name = console.next();

				ListOfCategories test = new ListOfCategories();
				System.out.println(test.CheckCategories(name));

				Category NewCat = new Category(name);

				StudentAttempts NewStack = new StudentAttempts();
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
						String choice = console.next();
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
				int  order = qHolder.getIndex(NewCat);

				System.out.println("Do you want to return to main menu?(y/n)");
				char ans1 = console.next().charAt(0);
				ans1 = Character.toUpperCase(ans1);
				if (ans1 == 'Y') {
					S = S + "\n" + order + "-" + NewCat.Category;
					display(qHolder, sHolder);

				}

			}

			else if (option == 2) {

				System.out.println("\nPlease choose a category to view student attempts history :\n1-Sports"
						+ "\n2-History\n3-Tech\n4-Health\n5-Social\n---------------------------" + S);
				System.out.println("---------------------------");

				Scanner Input = new Scanner(System.in);
				int a = Input.nextInt();
				StudentAttempts S = sHolder.SearchStack(a);
				S.display();
				System.out.println("Would you like to return to main menu?(y or n)");
				char ans = Input.next().charAt(0);
				ans = Character.toUpperCase(ans);
				if (ans == 'Y') {
					display(qHolder, sHolder);
				}

			}else if (option==3){
				display(qHolder, sHolder);
				System.out.println("Please enter which category you want to delete");
				int categ= console.nextInt();
				ListOfCategories test1 = new ListOfCategories();
				test1.deleteAtIndex(categ);
				display(qHolder, sHolder);

			}

		} else if (Answer == 1)

		{
			quizAttempt(qHolder, sHolder, S);
		}

	}

	public void quizAttempt(ListOfCategories qHolder, ListOfStudentAttempts sHolder, String S) {
		Scanner Input = new Scanner(System.in);
		Actions(qHolder, sHolder, S);
		System.out.println("Would you like to return to main menu?(y or n)");
		char ans = Input.next().charAt(0);
		ans = Character.toUpperCase(ans);
		if (ans == 'Y') {
			display(qHolder, sHolder);
		}
	}

	public  void Actions(ListOfCategories qHolder, ListOfStudentAttempts sHolder, String S) {
		int a = 0;
		Scanner Input = new Scanner(System.in);
		while (a != 1 && a != 2 && a != 3 && a != 4 && a != 5) {
			try {
				//Hon fi she8el rekib kermel l new category
				System.out.println("\nPlease choose a category to start answering the quiz questions\nCategories:\n1-Sports"
						+ "\n2-History\n3-Tech\n4-Health\n5-Social\n---------------------------" + S);
				System.out.println("---------------------------");
				a = Input.nextInt();
				Student(qHolder,sHolder,a);
			} catch (InputMismatchException e) {
				System.out.println("Please enter the number of the category");
				Input.next();
			}
		}
	}

		public void Student(ListOfCategories qHolder,ListOfStudentAttempts sHolder,int a){
		Scanner Input = new Scanner(System.in);
			StudentAttempts User = new StudentAttempts();
			System.out.println("Enter your first name: ");
			String FName = Input.next();
			System.out.println("Enter your last name: ");
			String LName = Input.next();
			System.out.println("Enter your ID : ");

			int Id = Input.nextInt();
			boolean check = User.CheckID(Id,a);
			System.out.println(check);
			if (check){
				System.out.println("You can't do the exam twice");
			}
			int Grade = qHolder.SearchValueAtIndex(a).CalcGrade();
			sHolder.SearchStack(a).push(FName, LName, Grade, Id);
		}


	}

