package com.programming.pattern;

 class PrintTringle02 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=1;i<=10;i++){ //this is OUTER loop it can be use as row as-well-as colum
            for (int j=1;j<=10;j++){ //this is used to print the character as "*"
                if(i<=j) {
                    System.out.print(" * ");
                    Thread.sleep(100);//here i use thread sleep to slow the execution
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println(); // note here we use  println() to chge the line after every loop
        }
    }
}
