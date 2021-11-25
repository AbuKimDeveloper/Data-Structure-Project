package com.company;

public class AllQuizes {
    Quiz quiz[];

    void push(Quiz quizz, int size) {
        Quiz newQuiz[] = new Quiz[size];
        for(int i = 0; i < newQuiz.length; i++) {
            if(i >= quiz.length) {
                newQuiz[i] = quizz;
                break;
            }
            newQuiz[i] = this.quiz[i];
        }
        this.quiz = newQuiz;
    }
}
