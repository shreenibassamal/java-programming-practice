package com.programming.array;

import java.util.Arrays;

public class ShiftZeros {
    public static void main(String[] args) {
        // here we declare a array
        int []a= {1,5,81,5,4,5,1,4,4,0,0,444,0,47,0,0,886,0};
        // here we declare a temporary array
        int []b=new int[a.length];
        int []d=new int[a.length];
        // take the total index count
        int index = a.length-1;

        // iterate the "a" array Reverse
        for (int i = a.length-1;i>= 0;i--) {
            if (a[i]!=0){
               b[index--]= a[i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
