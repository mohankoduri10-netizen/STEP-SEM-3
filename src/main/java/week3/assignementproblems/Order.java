package week3.assignmentproblems;

import java.util.Scanner;

public class Order {
    static int totalOrders = 0;

    public Order() {
        totalOrders++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            new Order();
        }

        System.out.println("Total orders: " + Order.totalOrders);

        sc.close();
    }
}