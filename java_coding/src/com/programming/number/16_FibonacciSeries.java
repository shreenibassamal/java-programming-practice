package com.programming.number;
import java.util.*;
 class FibonacciSeries {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to Fibonacci series program");
   System.out.print("Enter the range of Fibonacci series: ");
  int num=sc.nextInt();
   int fibbo = printFibonacci(num);
   System.out.println(fibbo);
  }
  public static int printFibonacci(int num){
   int first=0, second=1;
   int fibbo=0;
   System.out.println(fibbo);
   System.out.println(1);
   for (int i=1;i<=num;i++){
    fibbo = first+second;
    System.out.println(fibbo);
    first=second;
    second=fibbo;
   }

      return fibbo;
  }

}
