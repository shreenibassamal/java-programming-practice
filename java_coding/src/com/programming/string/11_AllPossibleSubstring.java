package com.programming.string;

import java.util.*;

 class AllPossibleSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String to find all possible Substring: ");
        String str = sc.next();
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (str.length()>=2){
                    System.out.println(str.substring(i,j));
                }
            }
        }
    }
}
