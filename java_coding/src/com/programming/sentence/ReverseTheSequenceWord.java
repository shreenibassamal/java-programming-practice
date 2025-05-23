package com.programming.sentence;

import java.util.Scanner;

public class ReverseTheSequenceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anything to reverse the word only: ");
        String str = sc.nextLine();
        String[] sa = str.split( " ");
        for (int i= sa.length-1;i>=0;i--){
            System.out.print(sa[i]+" ");
        }

    }

}
