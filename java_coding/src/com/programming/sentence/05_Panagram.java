package com.programming.sentence;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

class Panagram {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("Welcome to Reverse word in a sentence program ");
   System.out.print("Enter any sentence with randomly: ");
   String str = sc.nextLine();
   str.toLowerCase(;

   System.out.println(str);
   LinkedHashSet linkedHashSet = new LinkedHashSet();

   for (int i = 0; i < str.length(); i++) {
    char  = str.charAt(i);

    if (Character.isAlphabetic(str.charAt(i))) {
     linkedHashSet.add(str.charAt(i));
    }
   }
   if (linkedHashSet.size() == 26) {
    System.out.println("its a panagram");
   }
   else {
    System.out.println("its not  panagram");
   }
  }
}
