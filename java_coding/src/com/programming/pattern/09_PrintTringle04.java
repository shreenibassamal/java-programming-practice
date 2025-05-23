package com.programming.pattern;

 class PrintTringle04 {
    public static void main(String[] args) throws InterruptedException {
        for (int i=1;i<=5;i++){ //this is OUTER loop run as row by row
            for (int j=1;j<=5;j++){ //this is used to print the character as "*"
                if(i+j>=5+1 ) {
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
