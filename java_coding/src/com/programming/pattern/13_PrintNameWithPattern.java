package com.programming.pattern;

import java.util.Scanner;

 class PrintNameWithPattern {
    public static void main(String[] args) {
        System.out.println("Welcome to name printing  program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name you want to print: ");
        String name = sc.nextLine();
        int nameLength = name.length();
    }
}
