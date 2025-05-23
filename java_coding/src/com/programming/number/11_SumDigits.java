package com.programming.number;
import java.util.*;

 class SumOfDigits {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Sum Of Digit of an integer program");
         System.out.print("Enter any integer value to see the sum of Digits: ");
         int num = sc.nextInt();
         int sum = sumOfDigits(num);
         System.out.println("Sum of Digits is: "+sum);

     }
     public static int sumOfDigits(int num){
         int sum=0;
         for (;num>0; num=num/=10)
             sum=sum+(num%10);
         return sum;
     }

}
