package week3.practiceproblems;

import java.util.Scanner;

public class Student {
    String name;
    int marks;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name: ");
        student.name = sc.nextLine();

        System.out.print("Enter student marks: ");
        student.marks = sc.nextInt();

        System.out.println("Name: " + student.name
                + " | Marks: " + student.marks);

        sc.close();
    }
}