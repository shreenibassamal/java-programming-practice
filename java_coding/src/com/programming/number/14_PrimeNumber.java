package com.programming.number;

import java.util.Scanner;

 class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to prime number program");
        System.out.print("Enter any number to checj its prime or not: ");
        int num = sc.nextInt();
        boolean result = isprimenumber(num);
        if (result){
            System.out.println(num+" is a prime number");
        }
        else {
            System.out.println(num+" is not a prime number");
        }
    }
    public static boolean isprimenumber(int num){
        for (int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
