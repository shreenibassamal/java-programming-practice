package com.programming.number;

import java.util.Scanner;

class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number Checker\n");
        System.out.print("Enetr your number: ");
        int num = sc.nextInt();
        if (num<0){
            System.out.println("number "+num+" is negative number ");
        } else if (num==0) {
            System.out.println("number "+num+" is zero ");
        }
        else {
            System.out.println("number "+num+" is positive number  number ");
        }


    }

}
