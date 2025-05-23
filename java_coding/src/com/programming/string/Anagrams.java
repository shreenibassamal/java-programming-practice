package com.programming.string;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Anagrams.isTwoStringAnagrams();
    }

    private static void isTwoStringAnagrams() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first String: ");
        String str1 = sc.next();
        System.out.print("Enter your second String: ");
        String str2 = sc.next();
        System.out.println("The length of >>" + str1 + "<< is: " + str1.length());
        System.out.println("The length of >>" + str2 + "<< is: " + str2.length());
        if (str1.length() == str2.length()) {
            System.out.println("The length of >>" + str2 + "<<  and >>" + str2 + "<< is: same");
            char[] a1 = str1.toLowerCase().toCharArray();
            char[] a2 = str2.toLowerCase().toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            if (Arrays.equals(a1, a2)) {
                System.out.println("these two string " + str1 + " and " + str2 + " are anagrams");
            }
            else {
                System.out.println("these two string >> " + str1 + "<< and >>" + str2 + "<< are not anagrams");
            }
        } else {
            System.out.println("these two string >> " + str1 + "<< and >>" + str2 + "<< are not anagrams");
        }
    }
    }
