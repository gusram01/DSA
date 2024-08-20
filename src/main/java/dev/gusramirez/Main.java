package dev.gusramirez;

import java.util.List;

import dev.gusramirez.illuminated.Sorter;

public class Main {
    public static void main(String[] args) {

        // int[] target = new int[5];
        // Arrays.fill(target, 1);
        // int[] arr = new int[5];
        // Arrays.fill(arr, 1);

        // var result = AreEqualByReversingSubarrays.execute(target, arr);

        // System.out.println(result);

        var unordered = List.of(5, 4, 1, 8, 7, 2, 6, 3);

        var ordered = Sorter.byMerge(unordered);

        System.out.println(ordered);
    }

}
