package com.programming.array_assignment_01;

 class SumOfElementAtOddIndex {
    public static void main(String[] args) {
        int [] arr ={0,4,1,5,7,8,9};
        int sum=0;
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum +=arr[i];
            }
        }
        System.out.println("Sum of element in even index of  given array: "+sum);
    }
}
