package com.programming.string;

//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
import java.util.*;

 class PrintDuplicate {
    public static void main(String[] args) {
        PrintDuplicate.printDuplicateCharacter();

    }
    public static void printDuplicateCharacter(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  string value for finding the duplicate character: ");
        String str = sc.next();
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();

        for (int i =1;i<=str.length()-1;i++) {
            Character ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
            for (Map.Entry<Character,Integer> map :hm.entrySet()){
                if (map.getValue()>1){
                    System.out.println(map.getKey()+ " key  occurence is >>>> "+map.getValue()+" <<<< so it is duplicate   ");
                }

            }
        }

    }
