/*
Task:
Given a Book class and a Solution class, write a MyBook class that does the following:

- Inherits from Book
- Has a parameterized constructor taking these  parameters:
string title
string author
int price

Implements the Book class' abstract display() method so it prints these  lines:
Title, a space, and then the current instance's title.
Author, a space, and then the current instance's author.
Price, a space, and then the current instance's price.

 */

package com.challenges.objectorientation;

public class MyBook extends Book {
    int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    public String display() {
        String head = "Details: ";
        String body = "{" +
                        "Price: " + price +
                        ", Title: '" + title + '\'' +
                        ", Author: '" + author + '\'' +
                        '}';
        return head.concat(body);
    }
}
