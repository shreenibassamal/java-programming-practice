package com.programming.array_assignment_01;
import java.util.*;
 class MinElement {
    public static void main(String[] args) {
        int [] arr ={5,8,58,5,6,4,8,9,8,8};
        Arrays.sort(arr);
        System.out.println("Min element in given array is: "+ arr[0]);
    }
}
