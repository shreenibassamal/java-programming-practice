package com.programming.number;

import java.util.Scanner;

class AmstrongNumber {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to Amstrong Number Checker program EXample of Three-digit numbers: 153, 370, 371, 407");
   System.out.println("Enter any number to check Amstrong number or not: ");
   int num = sc.nextInt();
   isArmstrongNumber(num);
  }
  public static void isArmstrongNumber(int num){
   int actualvalue=num;
   int digitCube=0;
   int finalSum =0;

   for (int i = 0;num>0;num=num/10){
    int digits = num % 10;
    digitCube=digits*digits*digits;
    finalSum = finalSum+digitCube;
   }
   System.out.println(finalSum);
   if (actualvalue==finalSum){
    System.out.println("The given number >> "+actualvalue+" << is a Armstrong Number");
   }
   else {
    System.out.println("The given number >> "+actualvalue+" << is  not a Armstrong Number");
   }


  }
}
