package com.company;

public class StudentAttempts {
	Student first;
	StudentAttempts next;

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

	public boolean isEmpty() {
		if (first == null) {
			return true;
		}
		return false;
	}

	public StudentAttempts() {
		first = null;
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
	public Student SearchValueAtIndex(int index) { //3mela binary search
		int counter = 1;
		Student  current = first;
		while (counter != index) {
			current = current.next;
			counter++;
		}
		return current;
	}
	public boolean CheckID(int id,int index){
		boolean checker=false;
		StudentAttempts s1 =SearchValueAtIndex(index);
			StudentAttempts temp= new StudentAttempts();
			while (!isEmpty()){
				Student d1= new Student();
				d1=s1.pop();
				temp.push(d1.firstName, d1.lastName, d1.Grade, d1.ID);
				if (d1.ID==id)
					checker = true;
			}
			while (!temp.isEmpty()){
				Student d2= new Student();
				d2=temp.pop();
				s1.push(d2.firstName, d2.lastName, d2.Grade, d2.ID);
			}
		return checker;
	}




	void display() {
		if (!(isEmpty())) {
			StudentAttempts Temp = new StudentAttempts();

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

		} else {
			System.out.println("No Student Records!");
		}
	}

}