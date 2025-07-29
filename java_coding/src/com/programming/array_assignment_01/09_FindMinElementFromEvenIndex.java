package com.programming.array_assignment_01;

 class FindMinElementFromEvenIndex {
    public static void main(String[] args) {
        int [] arr = {2,5,9,5,54,44,5,51,1,10,};
        int min =Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(i%2==0 && min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The min value from even index of an array is: "+min);
    }
}
