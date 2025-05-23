package com.programming.number;

import java.util.Scanner;

class EvenOdd {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to Even and Odd number Checker\n");
   System.out.print("Enetr your number: ");
   int num = sc.nextInt();
   if (num%2==0){
    System.out.println("number "+num+" is Even number ");

   }
   else {
    System.out.println("number "+num+" is Odd number ");
   }
  }
}
