package com.programming.basic_assignment_01;

 class ReverseOnlyWords {
    public static void main(String[] args) {
        String s = "king is my name";
        String []str =s.split(" ");
        for(int i =str.length-1;i>=0;i--){
            System.out.print(str[i]+" ");
        }
    }
}
