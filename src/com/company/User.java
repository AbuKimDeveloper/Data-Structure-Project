package com.company;
public class User {
    String firstName;
    String lastName;
    Boolean isFemale;
    String nationality;
    int age;

    User(String firstName,String lastName, boolean isFemale, String nationality, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.isFemale=isFemale;
        this.nationality=nationality;
        this.age=age;
    }

}
