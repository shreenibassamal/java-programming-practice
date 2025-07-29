package com.programming.array_assignment_01;

 class MaxValueFromFirstHalf {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int [] arr= {2,6,4,5,3,2};
        for (int i = 0;i< arr.length/2;i++){
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("max-Value From Second-Half Of An Array: " +max);
    }
}
