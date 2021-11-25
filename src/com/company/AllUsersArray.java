package com.company;

public class AllUsersArray {
    User allUsers[] = new User[1];
    AllUsersArray(User user) {
        allUsers[0] = user;
    }
    void push(User user) {
        User newAllUsers[] = new User[allUsers.length + 1];
        for(int i = 0; i < newAllUsers.length; i++) {
            if(i >= allUsers.length) {
                newAllUsers[i] = user;
                break;
            }
            newAllUsers[i] = allUsers[i];
        }
        this.allUsers = newAllUsers;
    }

    void pop() {
        User newAllUsers[] = new User[allUsers.length - 1];
        for(int i = 0; i < newAllUsers.length; i++) {
            newAllUsers[i] = allUsers[i];
        };
        this.allUsers = newAllUsers;
    }

    void insertElementAtIndex (int index,User user) {
        if(index == this.allUsers.length) {
            this.push(user);
            return;
        }
        if(index > this.allUsers.length) {
            System.out.println("Cannot add patient");
            return;
        }
        User[] newUsers = new User[this.allUsers.length + 1];

        for (int i = 0; i < index; i++) {
            newUsers[i] = allUsers[i];
        }
        newUsers[index] = user;

        for (int i = index + 1; i <= allUsers.length; i++) {
            newUsers[i] = allUsers[i - 1];
        }
        allUsers = newUsers;
    }

    void display() {
        for(int i =0; i < this.allUsers.length ; i++) {
            System.out.println(this.allUsers[i]);
        }
    }
}