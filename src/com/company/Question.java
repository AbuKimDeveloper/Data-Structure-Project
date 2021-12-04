package com.company;
public class Question {
	public int data;
	public String Question;
	public String[] choices = new String[4];
	public int IndexOfCorrectAns = 0;
	public Question next;
	public String ShortAnswer;

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
