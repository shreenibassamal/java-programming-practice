package com.programming.basic_assignment_01;

 class PrintUniqueWordsFromStringArray {
    public static void main(String[] args) {
        String[] s = {"java", "is", "programming", "language", "in", "Tekpyramid", "but", "java", "is", "c+", "ptyhon", "also", "programming", "language"};

        boolean[] visited = new boolean[s.length];
        for (int i = 0; i < s.length; i++) {
            if (visited[i] != false) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[i].equals(s[j])) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(s[i] + " ");
            }

        }
    }
}
