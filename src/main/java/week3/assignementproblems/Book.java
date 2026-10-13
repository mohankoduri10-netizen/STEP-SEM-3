package week3.assignmentproblems;

import java.util.Scanner;

public class Book {
    String title;
    double price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter book title: ");
        book.title = sc.nextLine();

        System.out.print("Enter book price: ");
        book.price = sc.nextDouble();

        System.out.println("Title: " + book.title
                + " | Price: Rs " + book.price);

        sc.close();
    }
}