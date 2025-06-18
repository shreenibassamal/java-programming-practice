package com.programming.stringBasic;

import java.util.Scanner;

 class CharCount {
    //Java Program to count the total number of characters in a string
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to character count program in java");
       System.out.print("Enter any string to count to count the characters: ");
        String str =sc.nextLine();
        charCount(str);
    }
    public static void charCount(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("The total character in the given string is :"+count);
    }

}
