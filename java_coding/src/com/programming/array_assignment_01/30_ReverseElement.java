package com.programming.array_assignment_01;

import java.util.Arrays;
import java.util.Collections;

 class ReverseElement {
    public static void main(String[] args) {
        Integer [] arr ={0,1,2,4,7,7,8,9};
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
