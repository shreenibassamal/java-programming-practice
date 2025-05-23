package com.programming.number;

import java.util.Scanner;

 class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to OddSum program\n");
        System.out.print("Enter strating range: ");
        int start = sc.nextInt();
        int oddSum=0;

        System.out.print("Enter Ending range: ");
        int end = sc.nextInt();
        System.out.print("The odd numbers are: ");
        for (;start<=end;start++){
            if (start%2!=0){
                System.out.print(start+", ");
                oddSum = oddSum+start;
            }
        }
        System.out.println("\nthe sum of odd numbers is: "+oddSum);
    }
}
