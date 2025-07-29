package com.programming.basic_assignment_01;

import java.util.Arrays;
import java.util.LinkedHashSet;

 class MergeTwoArrayAndReomveDuplicates {
    public static void main(String[] args) {
        int []a={1,5,4,7,9,46,4,5};
        int []b={5,5,588,6,5,4,79,5};
        int [] c = new int[a.length+b.length];

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));
        for(int n:c){
            lhs.add(n);
        }
        System.out.println(lhs);
    }
}

