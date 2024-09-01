package dev.gusramirez;

import dev.gusramirez.leetcode.Convert1DTo2DArray;

public class Main {
    public static void main(String[] args) {

        int[] original = { 1, 2, 3, 4 };

        var result = Convert1DTo2DArray.execute(original, 3, 3);

        for (var row : result) {
            for (var col : row) {
                System.out.print(col + " | ");
            }
            System.out.println("----------------");
        }
    }

}
