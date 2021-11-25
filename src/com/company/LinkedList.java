package com.company;
import java.util.Random;
import java.util.Scanner;


public class LinkedList {
    Node first;
    String Name;

    public LinkedList(String S) {
        first = null;
        Name = S;
    }

    public LinkedList() {
        first = null;
        Name = null;
    }

    public boolean isEmpty() {
        if (first == null) {
            return true;
        }
        return false;
    }

    public void display() {
        int Grade = 0;

        Scanner Input = new Scanner(System.in);
        Random random = new Random();
        int Sub[] = new int[10];
        int sub = 0;

        if (!(isEmpty())) {
            Node current = first;
            System.out.println(current.Question);
            LinkedList indices = new LinkedList();

            int counter = 1;
            while (counter <= 4) {
                int i = random.nextInt(4);
                if ((indices.Search(i)) == false) {
                    System.out.println(counter + "-" + current.Choices[i]);
                    counter++;
                    indices.insertAtBack(i);
                }
            }
            System.out.println();
            int answer;

            do {
                System.out.print("Answer(numbers only): ");
                answer = Input.nextInt();
            } while (!((answer == 1 || answer == 2 || answer == 3 || answer == 4)));
            Sub[sub] = answer;
            sub++;
            Grade += Grading(answer, indices, current.IndexOfCorrectAns);
            System.out.println();
            current = current.next;
            indices.clearLinkedList();

            while (current != null) {
                System.out.println(current.Question);
                counter = 1;
                while (counter <= 4) {
                    int i = random.nextInt(4);
                    if ((indices.Search(i)) == false) {
                        System.out.println(counter + "-" + current.Choices[i]);
                        counter++;
                        indices.insertAtBack(i);
                    }
                }
                do {
                    System.out.print("Answer(numbers only): ");
                    answer = Input.nextInt();
                    System.out.println();
                } while (!((answer == 1 || answer == 2 || answer == 3 || answer == 4)));
                Sub[sub] = answer;
                sub++;
                Grade += Grading(answer, indices, current.IndexOfCorrectAns);
                System.out.println();
                current = current.next;
                indices.clearLinkedList();

            }
            System.out.println();
            System.out.println();
            System.out.println("Your Grade is: " + Grade + "/100");

        }
    }

    public void insertAtBack(String Question, String[] Choices, int C) {
        if (!(isEmpty())) {
            Node n = new Node(Question, Choices, C);
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        } else {
            Node n = new Node(Question, Choices, C);
            first = n;
        }
    }

    public void deleteAtBack() {
        Node current = first;
        Node previous = first;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;

    }

    public void deleteFromIndex(int i) {
        Node current = first;
        Node previous = first;
        for (int j = 1; j < i; j++) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
    }

    public boolean Search(int i) {
        if (!(isEmpty())) {
            Node current = first;
            if (current.data == i) {
                return true;
            }
            while (current != null) {
                if (current.data == i) {
                    return true;
                }
                current = current.next;
            }
            return false;

        }
        return false;
    }

    public void insertAtBack(int i) {
        Node n = new Node(i);
        Node current = first;
        if (!(isEmpty())) {
            while (current.next != null) {
                current = current.next;
            }
            current.next = n;
        } else {
            first = n;
        }
    }

    public void displayLinkedList() {
        Node current = first;
        if (!(isEmpty())) {
            System.out.println(current.data);
            current = current.next;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public int SearchValueAtIndex(int ans, LinkedList L) {
        int counter = 1;
        Node current = L.first;
        while (counter != ans) {
            current = current.next;
            counter++;
        }
        return current.data;
    }

    public int Grading(int ans, LinkedList L, int b) {
        int a = SearchValueAtIndex(ans, L);
        if (a == b) {
            return 10;
        }

        return 0;
    }

    public void clearLinkedList() {
        first = null;
    }

}
