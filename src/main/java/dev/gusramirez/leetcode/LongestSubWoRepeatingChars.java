package dev.gusramirez.leetcode;

import java.util.LinkedHashSet;

public class LongestSubWoRepeatingChars {

    public static int bySlidingWindowWithSet(String entry) {

        var longest = 0;
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < entry.length(); i++) {

            var character = entry.charAt(i);

            var hasElement = set.contains(character);

            if (hasElement) {
                removeUntil(set, character);
            }

            set.addLast(character);

            if (set.size() > longest) {
                longest = set.size();
            }
        }

        return longest;

    }

    public static void removeUntil(LinkedHashSet<Character> set, Character character) {
        while (set.size() > 0) {
            var first = set.removeFirst();
            if (first == character) {
                break;
            }
        }
    }

}
