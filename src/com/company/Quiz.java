package com.company;

public class Quiz {
    String choices[]= new String[4];
    String Question;
    Quiz(String question) {
        this.Question = question;
    }
    // Method overloading
    void addChoice(String choice){
        choices[3] = choice;
    }
    void addChoice(String choice,int i ){
         choices[i] = choice;
    }

}
