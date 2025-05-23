package com.programming.number;

import java.util.Scanner;

class ReverseDigits {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("welcome to Reverse Digits program\n");
   System.out.print("Enter any number to reveres the number: ");
   int num = sc.nextInt();
   int revNum = revrse(num);
   System.out.println(revNum);
  }
  public static int revrse(int num){
   int rev=0;
   for (;num>0;num=num/10){
    int lastadigits=num%10;
    rev=rev*10+lastadigits;
   }
   return rev;
  }
}
