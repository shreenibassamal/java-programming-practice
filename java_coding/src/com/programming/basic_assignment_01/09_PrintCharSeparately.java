package com.programming.basic_assignment_01;

 class PrintCharTypeWise {
    public static void main(String[] args) {
        String str = "bhcdg87687678^^%%%&^%876";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
