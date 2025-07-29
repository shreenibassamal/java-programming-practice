package com.programming.array_assignment_01;

 class SumOfElementFromSecondHalfOfAnArray {
    public static void main(String[] args) {
        int [] arr= {1,1,1,2,2,2};
        int sum = 0;
        for (int i = arr.length/2;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum Of Element From Second-Half Of An Array: " +sum);
    }
}
