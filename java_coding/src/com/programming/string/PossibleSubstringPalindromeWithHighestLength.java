package com.programming.string;

import java.util.Scanner;

public class PossibleSubstringPalindromeWithHighestLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String to find all possible Substring: ");
        String str = sc.next();
        int length = 0;
        String str3 = "";
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                    String str1 = str.substring(i, j);
                    String str2 = new StringBuilder(str1).reverse().toString();
                    if (str1.equals(str2) && length<str1.length() ){
                        length = str1.length();
                        str3=str1;
                    }
                }
            }
        System.out.println(str3);
    }
}
