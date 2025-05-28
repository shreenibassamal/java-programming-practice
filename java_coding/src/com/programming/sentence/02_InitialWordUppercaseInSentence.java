package com.programming.sentence;

import java.util.Scanner;

class InitialWordUppercaseInSentence {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to First letter converter to uppercase program in a sentence ");
   System.out.print("Enter any sentence with randomly: ");
   String stnc = sc.nextLine();
   String resultStnc = "";
   String[] sa = stnc.split(" ");
   for (int i = 0 ;i<=sa.length-1; i++){
    String str = sa[i];
    String ua = Character.toUpperCase(str.charAt(0)) + str.substring(1) + " ";
    System.out.println(ua);
    resultStnc=resultStnc+ua;
   }
   System.out.println(resultStnc);
  }
}
