package com.programming.array_assignment_01;

 class MinValueFromFirstHalf {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int [] arr= {2,6,4,5,3,2};
        for (int i = 0;i< arr.length/2;i++){
            if (min<=arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min-Value From First-Half Of An Array: " +min);
    }
}
