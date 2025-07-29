package com.programming.array_assignment_01;

 class FindAverageOfElementFromEvenIndex {
    public static void main(String[] args) {
        int [] arr = {3,2,3,2,3,2};
        int oddIcount =0;
        int avr=0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                avr+=arr[i];
                oddIcount++;
            }
        }
        System.out.println("The Average Of Element From Even-Index is: "+avr/oddIcount);
    }
}
