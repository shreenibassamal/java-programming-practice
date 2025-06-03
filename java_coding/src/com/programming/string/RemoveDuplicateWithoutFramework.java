package com.programming.string;

import java.util.Scanner;

public class RemoveDuplicateWithoutFramework {
    public static void main(String[]args){
        System.out.println("Welcome to Remove Duplicates programm");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any  String: ");
        String str=sc.nextLine();
        swapTwoString(str);
    }

    public static void swapTwoString(String str){
        System.out.println("Enterd String is: "+str);
        String str2 ="";
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            int count=0;
            for(int j =0;j<str.length();j++){
                char temp = str.charAt(j);
                if(ch==temp){
                    count ++;
                }
            }
            if(count<2){
                str2=str2+ch;
            }
        }
        System.out.println("after removing duplicate: "+str2);
    }
}
