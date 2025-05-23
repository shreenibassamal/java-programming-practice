package com.programming.number;
import java.util.*;
 class LCM {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to LCM program");
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();
        int factor = lcmOfTwoNumber(num1, num2);
        System.out.println(factor);

    }
    public static int lcmOfTwoNumber(int num1, int num2){

        for (int i = 1;true;i++){
            int factor =num1*i;
            if (factor % num2==0){
                return factor;
            }
        }
    }
}
