package com.company;

public class Node {
    int data;
    String Question;
    String[] Choices = new String[4];
    int IndexOfCorrectAns;
    Node next;

    public Node(String Question, String[] Choices, int IndexOfCorrectAns) {
        this.Question = Question;
        for (int i = 0; i < 4; i++) {
            this.Choices[i] = Choices[i];
            this.IndexOfCorrectAns = IndexOfCorrectAns;
        }
    }


    public Node(int i) {
        data = i;
    }
}
