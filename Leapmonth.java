/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.leapmonth;


import java.util.Scanner;

public class Leapmonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = scanner.nextInt();
        System.out.println("Enter the month:");
        int month = scanner.nextInt();

        boolean isLeapMonth = (year % 4 == 0) || (year % 100 != 0 && year % 4 == 0) || (year % 400 == 0);

        if (isLeapMonth) {
            System.out.println(month + " is a leap month.");
        } else {
            System.out.println(month + " is not a leap month.");
        }
    }
}

