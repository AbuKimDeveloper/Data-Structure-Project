package com.company;

public class Queue extends LinkedList {
    String Category;
    Queue next;

    public Queue(String Category) {
        this.Category = Category;
    }

    public void enqueue(String Question, String[] Choices, int C) {
        super.insertAtBack(Question, Choices, C);
    }



    @Override
    public void display() {
        super.display();
    }

}
