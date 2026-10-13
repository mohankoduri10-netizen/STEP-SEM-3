package week3.practiceproblems;

import java.util.Scanner;

public class Applicant {
    static int totalApplicants = 0;

    public Applicant() {
        totalApplicants++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            new Applicant();
        }

        System.out.println(
                "Total applicants: " + Applicant.totalApplicants
        );

        sc.close();
    }
}