package com.programming.sentence;

import java.util.Scanner;

 class SwapFirstAndLastWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to First letter converter to uppercase program in a sentence ");
        System.out.print("Enter any sentence with randomly: ");
        String stnc = sc.nextLine();
        String result = "";

      String[] stncArr = stnc.split(" ");
      result=result+stncArr[stncArr.length-1]+" ";
      for (int i=1;i<stncArr.length-1;i++){
          result= result+stncArr[i]+" ";
      }
      result=result+stncArr[0];
        System.out.println(result);
    }
}
