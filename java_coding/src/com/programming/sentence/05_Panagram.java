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
   String lstr = str.toLowerCase();
   System.out.println(lstr);
   LinkedHashSet linkedHashSet = new LinkedHashSet();
   for (int i = 0; i < str.length(); i++) {
    char  s = lstr.charAt(i);
    if (Character.isAlphabetic(lstr.charAt(i))) {
     if (Character.isAlphabetic(s)){
      linkedHashSet.add(lstr.charAt(i));
     }
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
