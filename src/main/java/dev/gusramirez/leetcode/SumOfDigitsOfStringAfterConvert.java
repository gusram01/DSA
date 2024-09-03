package dev.gusramirez.leetcode;

import java.util.stream.Collector;

/**
 * You are given a string s consisting of lowercase English letters, and an
 * integer k.
 *
 * First, convert s into an integer by replacing each letter with its position
 * in the alphabet (i.e., replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
 * Then, transform the integer by replacing it with the sum of its digits.
 * Repeat the transform operation k times in total.
 *
 * For example, if s = "zbax" and k = 2, then the resulting integer would be 8
 * by the following operations:
 *
 * Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124
 * Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17
 * Transform #2: 17 ➝ 1 + 7 ➝ 8
 * Return the resulting integer after performing the operations described above.
 */
public class SumOfDigitsOfStringAfterConvert {

    public static int execute(String s, int k) {
        var some = s.chars()
                .boxed()
                .parallel()
                .map(c -> c - 'a' + 1)
                .map(String::valueOf)
                .collect(
                        Collector.of(
                                StringBuilder::new,
                                StringBuilder::append,
                                StringBuilder::append,
                                StringBuilder::toString));

        String result = some;

        for (int i = 0; i < k; i++) {

            result = sumOfString(result);

        }

        return Integer.parseInt(result);
    }

    private static String sumOfString(String s) {
        return String.valueOf(s.chars()
                .boxed()
                .parallel()
                .map(c -> c - '0')
                .reduce((a, b) -> a + b)
                .orElse(0));
    }
}
