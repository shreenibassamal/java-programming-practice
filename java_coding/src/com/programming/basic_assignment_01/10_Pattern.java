package com.programming.basic_assignment_01;

 class Pattern {
    public static void main(String[] args) {
        for(int i=1 ;i<=4;i++){
            for(int j=1 ;j<=6;j++){
                if(i==4){
                    System.out.print(" "+j);
                } else{
                    System.out.print(" "+i);
                }
            }
            System.out.println(" ");

        }
    }
}
