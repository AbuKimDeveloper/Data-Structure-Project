package com.company;

public class QueueLinkedList {
    Queue first;
    String Name;


    public QueueLinkedList(String S) {
        first = null;
        Name = S;
    }

    public QueueLinkedList() {
        first = null;
        Name = null;
    }

    public void insertAtFront(Queue Q) {
        Q.next = first;
        first = Q;
    }





}
