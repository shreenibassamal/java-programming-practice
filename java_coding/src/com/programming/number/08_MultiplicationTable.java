package com.programming.number;

import java.util.Scanner;

class MultiplicationTable {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Multiplication table World\n");
         System.out.print("Enetr any number to generate the multiplication table: ");
         int num = sc.nextInt();
         MultiplicationTable.printMultiplicationTable(num);
         }

         public static void printMultiplicationTable(int num){
             for (int i = 1;i<=10;i++){
                 System.out.println(num+" * "+i+" = "+num*i);
             }
         }
     }
