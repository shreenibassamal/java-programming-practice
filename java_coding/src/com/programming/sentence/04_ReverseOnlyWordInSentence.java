package com.programming.sentence;

import java.util.Scanner;

 class ReverseOnlyWordInSentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Reverse word in a sentence program ");
        System.out.print("Enter any sentence with randomly: ");
        String stnc = sc.nextLine();
        String result = "";

        String[] stncArr = stnc.split(" ");

        for (int i=0;i<= stncArr.length-1;i++){
            String str = stncArr[i];
            String sa="";
            for (int j = str.length()-1; j>=0; j--){
               char s =str.charAt(j);
               sa=sa+s;
            }
            result=result+sa+" ";

        }

        System.out.println(result);
    }
}
