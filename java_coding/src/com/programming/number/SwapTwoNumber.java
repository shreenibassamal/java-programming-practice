package com.programming.number;
import java.util.*;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to variable value SWAPPING program");
        System.out.print("Enetr your first variable: ");
        int first = sc.nextInt();

        System.out.print("Enetr your second variable: ");
        int second = sc.nextInt();

        first = first+second;
        second=first-second;
        first=first-second;

        System.out.println("After SWAPPING the value of variables are:  ");
        System.out.println("The first value now: "+first);
        System.out.println("The second value now: "+first);

    }
}
