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

import java.util.List;

public class Student extends Person {

    private List<Integer> testScores;
    int finalGrade;
    char grade;

    public Student() {
        super();
    }

    public Student(String firstName, String lastName, Integer idNumber, List<Integer> testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public int calculateGrade(List<Integer> testScores) {
        int sum = 0;
        for (int grade : testScores) {
            sum += grade;
        }
        return this.finalGrade = sum / (testScores.size());
    }

    public char convertGrade(int finalGrade) {

        if (finalGrade >= 90 && finalGrade <= 100) {
            this.grade = 'O';
        } else if (finalGrade < 90 && finalGrade >= 80) {
            this.grade = 'E';
        } else if (finalGrade < 80 && finalGrade >= 70) {
            this.grade = 'A';
        } else if (finalGrade < 70 && finalGrade >= 55) {
            this.grade = 'P';
        } else if (finalGrade < 55 && finalGrade >= 40) {
            this.grade = 'D';
        } else {
            this.grade = 'T';
        }

        return this.grade;
    }
}