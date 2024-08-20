package dev.gusramirez;

import dev.gusramirez.illuminated.Karatsuba;

public class Main {
    public static void main(String[] args) {

        // int[] target = new int[5];
        // Arrays.fill(target, 1);
        // int[] arr = new int[5];
        // Arrays.fill(arr, 1);

        // var result = AreEqualByReversingSubarrays.execute(target, arr);

        // System.out.println(result);

        var first = 5678;
        var second = 1234;

        int result = Karatsuba.executeWithRecursion(first, second);

        System.out.println(result);

    }

}
