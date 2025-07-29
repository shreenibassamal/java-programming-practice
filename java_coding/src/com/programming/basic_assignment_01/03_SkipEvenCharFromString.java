package com.programming.basic_assignment_01;

 class SkipEvenCharFromString {
    public static void main(String[] args) {
        String str = "king is my name";
        String s=str.replace(" ","");
        for(int i = 0;i<s.length();i++){
            if(i%2==0){
                System.out.print(s.charAt(i));
            }
            else{
                System.out.print(" ");
            }
        }

    }
}
