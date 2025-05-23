package com.programming.number;

import java.util.*;

 class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to factorial program\n");
        System.out.print("Enter the number you want to generate the factorial: ");
        int num = sc.nextInt();
        long fact = factorial(num);
        System.out.println("Fcatorial is: "+fact);
    }
    public static long factorial(int num){
        if (num<2){
            return 1;
        }
        long factorial = 1;
        for (int i =2;i<=num;i++){
            factorial= factorial*i;
        }
        return factorial;
    }

}
