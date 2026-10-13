package week3.practiceproblems;

import java.util.Scanner;

public class Course {
    String code;
    String title;

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course code: ");
        String code = sc.nextLine();

        System.out.print("Enter course title: ");
        String title = sc.nextLine();

        Course course = new Course(code, title);

        System.out.println(course.code + " - " + course.title);

        sc.close();
    }
}