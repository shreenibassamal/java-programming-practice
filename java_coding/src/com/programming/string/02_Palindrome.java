package com.programming.string;

import java.util.Scanner;

 class Palindrome {
    public static void main(String[] args) {
        Palindrome.isPalindrome();
    }
    public static void isPalindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string to check its palindrome or not: ");
        String str = sc.next();
        String rev = "";
        for (int i = str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            rev= rev+ch;
        }
        boolean result = str.equals(rev);
        if (result){
            System.out.print("Given string >>"+str+"<< is palindrome");
        }
        else {
            System.out.print("Given string >>"+str+"<< is not palindrome");
        }
    }
}
