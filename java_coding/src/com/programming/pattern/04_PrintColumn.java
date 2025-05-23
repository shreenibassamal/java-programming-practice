package com.programming.pattern;

 class PrintColumn {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){ //this is OUTER loop it can be use as row as-well-as colum
            System.out.println("column: "+i);
            for (int j=1;j<=10;j++){ //this is used to print the character as "*"
                System.out.println(" * ");
            }
        }
    }
}
