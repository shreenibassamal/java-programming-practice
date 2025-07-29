package com.programming.basic_assignment_01;

 class PrintCharSeparately {
    public static void main(String[] args) {
        String str = "ncksnc2151$%$%^$^&7862121jbj";
        int sum = 0;
        for(int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                String temp=str.substring(i, i + 1);
                sum +=Integer.parseInt(temp);
            }
        }
        System.out.println(sum);
    }
}
