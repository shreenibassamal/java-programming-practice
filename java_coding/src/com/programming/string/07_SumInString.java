package com.programming.string;

import java.util.Scanner;

 class SumInString {
    public static void main(String[] args) {
        SumInString.sumOfNumberInString();

    }
    public static void sumOfNumberInString(){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String for sum of number in side string value: ");
        String str = sc.next();
        for (int i =0;i<=str.length()-1;i++) {
            char ch = str.charAt(i);
            if (ch > '0' && ch < '9') {
                sum = sum + ch - 48;//substracting beacause converting char into number
            }
        }

        System.out.println(sum);

    }

}
