package dev.gusramirez;

import dev.gusramirez.leetcode.LongestSubWoRepeatingChars;

public class Main {
    public static void main(String[] args) {

        var one = "dvdf";

        var r1 = LongestSubWoRepeatingChars.bySlidingWindowWithSet(one);

        var two = "ckilbkd";

        var r2 = LongestSubWoRepeatingChars.bySlidingWindowWithSet(two);

        System.out.println("Result 1: " + r1);
        System.out.println("Result 2: " + r2);

    }

}
