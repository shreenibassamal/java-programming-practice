package com.programming.string;
import java.util.*;
 class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate.removeDuplicateFromString();
    }

    public static void removeDuplicateFromString(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String to remove the duplicate value: ");
        String str = sc.next();

        LinkedHashSet lhs = new LinkedHashSet();
        for (int i =0;i<str.length()-1; i++){
            lhs.add(str.charAt(i));
        }
        System.out.println(lhs);
    }
}
