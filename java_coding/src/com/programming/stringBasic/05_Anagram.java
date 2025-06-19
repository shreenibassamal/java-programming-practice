package com.programming.stringBasic;

import java.util.Scanner;

 class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first string : ");
        String str1 = sc.next().toLowerCase();
        System.out.print("Enter your second string : ");
        String str2 = sc.next().toLowerCase();

        for (int i =str1.length()-1;i<=0;i--){
            str2 +=str1.charAt(i);
        }
        if (str1.equals(str2)){
            System.out.println("This is Anagram");
        }
        else {
            System.out.println("This is not Anagram");
        }
    }
}
