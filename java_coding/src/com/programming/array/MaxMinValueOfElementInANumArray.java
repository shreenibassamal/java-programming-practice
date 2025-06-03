package com.programming.array;

public class MaxMinValueOfElementInANumArray {
    public static void main(String[] args) {

        int[] arr= {100,25, 4,55,4,8,20,4,4,1};
        int min =arr[0];
        int max =arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){max=arr[i];}
            if (arr[i]<min){min=arr[i];}
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
    }
}


