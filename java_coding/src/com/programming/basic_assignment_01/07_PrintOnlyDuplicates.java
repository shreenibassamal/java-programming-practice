package com.programming.basic_assignment_01;

 class PrintOnlyDuplicates {
    public static void main(String[] args) {
        String s = "my name is shreenibas";

        boolean[] visited = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (visited[i] != false) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count >= 2) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }
}
