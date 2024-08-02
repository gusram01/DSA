package dev.gusramirez.leetcode;

import java.util.HashMap;

public class TwoSum {
    public static int[] execute(int[] nums, int target) {
        int l = nums.length;

        for (int first = 0; first < l; first++) {

            var next = first + 1;

            while (next < l) {
                if (nums[first] + nums[next] == target) {
                    return new int[] { first, next };
                }

                next++;
            }

        }

        return new int[] {};
    }

    public static int[] executeHash(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                System.out.println("{" + i + ", " + map.get(diff) + "}");
                return new int[] { map.get(diff), i };
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] {};

    }

}
