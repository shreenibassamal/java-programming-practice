package com.programming.array_assignment_01;

 class SumOfElement {
    public static void main(String[] args) {
        int [] arr ={0,4,8,9,8,8};
        int sum=0;
        for(int a:arr){
            sum +=a;
        }
        System.out.println("Sum of element in given array: "+sum);
    }
}
