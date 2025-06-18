package com.programming.stringBasic;

import java.util.Scanner;

class UpperCase {
     public static void main(String[] args) {
             System.out.println("Welcome to conversion String to Upper case-programm ");
             System.out.print("Enter any String: ");
             Scanner sc = new Scanner(System.in);
             String str =sc.nextLine();
             System.out.println("Entered String is : "+str);
             System.out.println("String in UpperCase is : "+str.toUpperCase());
     }
}
