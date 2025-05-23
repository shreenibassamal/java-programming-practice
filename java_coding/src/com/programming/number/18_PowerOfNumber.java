package com.programming.number;

import java.util.Scanner;

class PowerOfNumber {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to power of number program");
   System.out.print("Enter the number you want: ");
   int base = sc.nextInt();

   System.out.print("Enter the power number you want: ");
   int power = sc.nextInt();

   Object result = printPower(base, power);
   System.out.println("The result of given number >>"+base+"<< with  the power >>"+power+"<< the result is:==> "+result);
  }
  public static Object printPower(int base, int power){
   int result = 1;
   for (int i=1;i<=power;i++){
    result =result*base;
       }
      return result;
  }
}
