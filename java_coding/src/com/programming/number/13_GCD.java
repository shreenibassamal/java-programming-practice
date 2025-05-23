package com.programming.number;

import java.util.Scanner;

class GCD {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to GCD program");
   System.out.print("Enter first number: ");
   int num1 = sc.nextInt();

   System.out.print("Enter Second number: ");
   int num2 = sc.nextInt();
   int gcd = gdcOftwonumber(num1, num2);
   System.out.println(gcd);


  }
  public static int gdcOftwonumber(int num1, int num2){
   int gcd = 1;
   int i = 2;
   int least=leastValue(num1,num2);

   for (i=1;i<least;i++){
    if (num1%i==0 && num2%i==0){
     gcd=1;
    }
   }
      return gcd;
  }

  public static int leastValue(int num1, int num2){
   if (num1 < num2){
    return num1;
   }else {
    return num2;

   }

  }

}
