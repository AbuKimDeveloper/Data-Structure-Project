package com.company;
public class Question {
	int data;
	String Question;
	String[] choices = new String[4];
	int IndexOfCorrectAns = 0;
	Question next;
	String ShortAnswer;

	Question(String question) {
		Question = question;
		next = null;
	}

	public Question(String Question, String[] choices, int IndexOfCorrectAns) {
		this.Question = Question;
		this.choices = choices;
		this.IndexOfCorrectAns = IndexOfCorrectAns;
		next = null;
	}

	// Method overloading
	void addChoice(String choice) {
		choices[3] = choice;

	}

	void addChoice(String choice, int i) {
		choices[i] = choice;

	}

	void addCorrectIndex(int C) {
		IndexOfCorrectAns = C;

	}

}
