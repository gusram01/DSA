package dev.gusramirez;

import java.util.Arrays;

import dev.gusramirez.leetcode.AreEqualByReversingSubarrays;

public class Main {
    public static void main(String[] args) {

        int[] target = new int[5];
        Arrays.fill(target, 1);
        int[] arr = new int[5];
        Arrays.fill(arr, 1);

        var result = AreEqualByReversingSubarrays.execute(target, arr);

        System.out.println(result);

    }

}
