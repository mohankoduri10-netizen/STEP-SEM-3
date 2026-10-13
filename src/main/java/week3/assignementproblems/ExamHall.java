package week3.assignmentproblems;

import java.util.Scanner;

public class ExamHall {
    String hallName;
    int seatsFilled;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ExamHall hallA = new ExamHall();
        ExamHall hallB = new ExamHall();

        System.out.print("Enter hall A name: ");
        hallA.hallName = sc.nextLine();

        System.out.print("Enter hall B name: ");
        hallB.hallName = sc.nextLine();

        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;
        hallA.seatsFilled++;

        System.out.println(hallA.hallName
                + " seatsFilled: " + hallA.seatsFilled);

        System.out.println(hallB.hallName
                + " seatsFilled: " + hallB.seatsFilled);

        sc.close();
    }
}