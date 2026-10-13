package week3.practiceproblems;

import java.util.Scanner;

public class HostelRoom {
    String roomNo;
    int occupied;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HostelRoom roomA = new HostelRoom();
        HostelRoom roomB = new HostelRoom();

        System.out.print("Enter room A number: ");
        roomA.roomNo = sc.nextLine();

        System.out.print("Enter room B number: ");
        roomB.roomNo = sc.nextLine();

        System.out.print("Enter initial occupied count for room A: ");
        roomA.occupied = sc.nextInt();

        System.out.print("Enter initial occupied count for room B: ");
        roomB.occupied = sc.nextInt();

        roomA.occupied++;
        roomA.occupied++;
        roomA.occupied++;

        System.out.println(roomA.roomNo
                + " occupied: " + roomA.occupied);

        System.out.println(roomB.roomNo
                + " occupied: " + roomB.occupied);

        sc.close();
    }
}