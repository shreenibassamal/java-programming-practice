package com.programming.stringBasic;

import java.util.Scanner;

 class StringSumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String value: ");
        String str=sc.nextLine();
        int sum = 0;
        for (int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                String temp = str.substring(i, i + 1);
                sum+=Integer.parseInt(temp);
            }
        }
        System.out.println(sum);

    }
}
