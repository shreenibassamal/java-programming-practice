package com.programming.array_assignment_01;

 class FindMaxElementFromOddIndex {
    public static void main(String[] args) {
        int [] arr = {2,5,9,5,54,44,5,51,1,10,};
        int max =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(i%2!=0 && max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
