package com.programming.pattern;

 class PrintInLineAndInBlock {
  public static void main(String[] args) {
   System.out.println("Welcome to Pattern program");
   //Print IN-LINE
   System.out.println("lets print 10 numbers of star character in-line [with ony using single star in inside printStatement ");
   for (int i =1;i<=10;i++){
    System.out.print(" * ");
   }

   //Print IN-BLOCK (notice here we using "\n" for change the line of execution
   System.out.println("\nlets print 10 numbers of star character in-Block [with ony using single star in inside printStatement ");
   for (int j =1;j<=10;j++){
    System.out.println(" * ");
   }

  }
}
