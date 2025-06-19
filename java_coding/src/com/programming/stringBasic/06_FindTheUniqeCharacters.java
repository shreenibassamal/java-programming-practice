package com.programming.stringBasic;

import java.util.Scanner;

 class FindTheUniqeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String value: ");
        String str = sc.nextLine();
        String strUnique="";

        for (int i=0 ;i<str.length();i++){
            int count=0;
            char temp1 = str.charAt(i);
            for (int j=0 ;j<str.length();j++){
                char temp2 = str.charAt(j);
                if(temp2==temp1){
                    count++;
                }
            }
            if (count==1){
                strUnique =strUnique+temp1+", ";
            }
        }
        System.out.println(strUnique);
    }
}
