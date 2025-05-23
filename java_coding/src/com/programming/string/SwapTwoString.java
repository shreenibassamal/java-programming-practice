package com.programming.string;

import java.util.Scanner;

public class SwapTwoString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String value to str1: ");
        String str1 = sc.next();
        System.out.print("Enter your second String value to str2: ");
        String str2 = sc.next();

        str1=str1+str2;
        str2= str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());

        System.out.println("After swaping the values are : ");
        System.out.println("Now value of str1 is: "+str1);
        System.out.println("Now value of str2 is: "+str2);
    }
}
