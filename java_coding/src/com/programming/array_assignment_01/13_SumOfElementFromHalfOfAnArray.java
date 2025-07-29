package com.programming.array_assignment_01;

 class SumOfElementFromFirstHalfOfAnArray {
    public static void main(String[] args) {
        int [] arr= {1,1,1,2,2,2};
        int sum = 0;
        for (int i = 0;i< arr.length/2;i++){
            sum+=arr[i];
        }
        System.out.println("Sum Of Element From First-Half Of An Array: " +sum);
    }
}
