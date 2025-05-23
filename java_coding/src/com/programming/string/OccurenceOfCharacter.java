package com.programming.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        OccurenceOfCharacter.countOccurence();
    }
    public static void countOccurence(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  string value to count occurencre of character: ");
        String str = sc.next();
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();

        for (int i =1;i<=str.length()-1;i++){
            Character ch = str.charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
        }
        System.out.println("The occurences  of ch are: "+hm);

    }
}
