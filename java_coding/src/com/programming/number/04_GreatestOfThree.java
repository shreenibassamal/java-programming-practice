package com.programming.number;

import java.util.Scanner;

class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to gretesh from three number Checker\n");
        System.out.print("Enetr your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enetr your Second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enetr your Third number: ");
        int num3 = sc.nextInt();
        if (num1>=num2 && num1>=num3){
            System.out.println("number "+num1+" is Greatest from Three nuber ");
        } else if (num2>=num1 && num2>=num3) {
            System.out.println("number "+num2+" is Greatest from Three nuber ");
        }
        else {
            System.out.println("number "+num3+" is Greatest from Three nuber ");
        }
    }
}
