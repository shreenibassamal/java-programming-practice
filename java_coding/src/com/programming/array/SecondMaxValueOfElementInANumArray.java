package com.programming.array;

public class SecondMaxValueOfElementInANumArray {
    public static void main(String[] args) {
        int[] arr= {100,25, 4,55,4,500,8,20,600, 4,4,};
        /*
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
         */
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                smax=max;
                max=arr[i];
            }else if(arr[i]>smax && arr[i]!=max){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }

    }

