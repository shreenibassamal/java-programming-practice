package com.programming.stringBasic;

import java.util.Scanner;

 class RemoveDigitsFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String value: ");
        String str = sc.nextLine();
        String str2="";
        for (int i =0;i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                str2 +=str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
