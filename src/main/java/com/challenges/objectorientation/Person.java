/*
Task
You are given two classes, Person and Student, where Person is the base class and Student
is the derived class.
Completed code for Person and a declaration for Student are provided for you in the editor.
 Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has 4 parameters:
A string, firstName.
A string, LastName.
An integer, idNumber.
An integer array (or vector) of test scores, 'scores'.

A char calculate() method that calculates a Student object's average and returns the grade
character representative of their calculated average:

Letter  -- Avarage (a)
O  -  90 <= a <= 100
E  - 80 <= a < 90
A  - 70 <= a < 80
P  - 55 <= a < 70
D  - 40 <= a < 55
T  - a < 40

 */

package com.challenges.objectorientation;

public class Person {
    protected String firstName;
    protected String lastName;
    protected Integer idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public Person() {}

    // Print person data
    public void printClient(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}
