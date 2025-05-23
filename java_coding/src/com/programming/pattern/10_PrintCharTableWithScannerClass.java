package com.programming.pattern;

import java.util.Scanner;

 class PrintCharTableWithScannerClass {
    public static void main(String[] args) {
        System.out.println("Welcome to table making program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row count of table you want: ");
        int row = sc.nextInt();

        System.out.print("Enter the column count of table you want: ");
        int column = sc.nextInt();
        printTable(row,column);
    }
    public static void printTable(int row, int column){
        for (int i=1;i<=row; i++){
            for (int j=1;j<=column;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
