package com.programming.array_assignment_01;

 class FindAverageOfElementFromOddIndex {
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,2,2};
        int oddIcount =0;
        int avr=0;
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                avr+=arr[i];
                oddIcount++;
            }
        }
        System.out.println("The Average Of Element From OddIndex is: "+avr/oddIcount);
    }
}
