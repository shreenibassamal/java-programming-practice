package com.programming.string;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        CountCharacter.FindNumberDigitSpecialCharacterAlphabetsInString();

    }
    public static void FindNumberDigitSpecialCharacterAlphabetsInString(){
        int alphaCount= 0, digitCount=0,specialCount=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  string value to count Number of ,Special character ,Digit,alphabets: ");
        String str = sc.next();
        for (int i =1;i<=str.length()-1;i++){
            char ch = str.charAt(i);

            if (ch>'0' && ch<='9'){
                digitCount++;

            } else if ((ch>='a' && ch<='z')&&(ch>='a' && ch<='z')) {
                alphaCount++;
            }
            else {
                specialCount++;
            }
        }
        System.out.println("digits: "+digitCount);
        System.out.println("alphanumeric: "+alphaCount);
        System.out.println("specialNumber: "+specialCount);
    }
}
