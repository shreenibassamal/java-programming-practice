package com.programming.number;

import java.util.Scanner;

 class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Leap Year Checker\n");
        System.out.print("Enetr any year: ");
        int year = sc.nextInt();
        if (year % 400==0||(year % 4==0 && year % 100!=0)){
            System.out.println("year "+year+" is a Leap Year ");
        }
        else {
            System.out.println("year "+year+" is not a Leap Year ");
        }

    }
}
