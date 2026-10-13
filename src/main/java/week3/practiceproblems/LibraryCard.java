package week3.practiceproblems;

import java.util.Scanner;

public class LibraryCard {
    String holderName;
    int booksIssued;
    boolean active;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryCard card = new LibraryCard();

        System.out.print("Enter holder name: ");
        card.holderName = sc.nextLine();

        System.out.print("Enter number of books issued: ");
        card.booksIssued = sc.nextInt();

        System.out.print("Is the card active? (true/false): ");
        card.active = sc.nextBoolean();

        System.out.println("Holder: " + card.holderName);
        System.out.println("Books Issued: " + card.booksIssued);
        System.out.println("Active: " + card.active);

        sc.close();
    }
}