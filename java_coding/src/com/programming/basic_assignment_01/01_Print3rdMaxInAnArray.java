package com.programming.basic_assignment_01;

import java.util.Arrays;

class Print3rdMaxInAnArray {
     public static void main(String[] args) {
             int [] arr = {1,5,9,6,3,4,5};
             Arrays.sort(arr);
             System.out.println("The Third maximum element  in given Array is: "+arr[arr.length-3]);
     }
}
