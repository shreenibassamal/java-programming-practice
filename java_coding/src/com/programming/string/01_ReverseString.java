package com.programming.string;

import java.util.Scanner;

 class ReverseString {
    public static void main(String[] args) {
        ReverseString.reverseString();


    }
    public static void reverseString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string you want to reverse=====>>: ");
        String str = sc.next();
        String rev = "";

        for (int i =str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            rev= rev+ch;
        }
        System.out.println("The reverse of given string is ==========>>: "+rev);
    }
}
