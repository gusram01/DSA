package dev.gusramirez.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class AreEqualByReversingSubarrays {

  /*
   * Constraints:
   *
   * target.length == arr.length
   * 1 <= target.length <= 1000
   * 1 <= target[i] <= 1000
   * 1 <= arr[i] <= 1000
   */
  public static boolean execute(int[] target, int[] arr) {
    var t = IntStream.of(target).boxed();
    var a = IntStream.of(arr).boxed();

    // var isAllEqual = IntStream.range(0, target.length)
    // .allMatch(i -> )
    var result = IntStream.concat(IntStream.of(target), IntStream.of(arr))
        .boxed()
        .distinct()
        .count();

    return result == target.length;

    // System.out.println(r);

    // return true;
    // List.of(target).stream()
    // .sorted()..toList().equals(List.of(arr).stream().sorted().toList());

    // for (int i = 0; i < target.length; i++) {
    // int c = target[i];
    // int c2 = arr[i];

    // if (!count.containsKey(c)) {
    // count.put(c, 1);
    // } else {
    // count.put(c, count.get(c) + 1);
    // }

    // if (!count.containsKey(c2)) {
    // count.put(c2, -1);
    // } else {
    // count.put(c2, count.get(c2) - 1);
    // }
    // }

    // var it = count.entrySet().iterator();

    // while (it.hasNext()) {
    // var entry = it.next();
    // if (entry.getValue() != 0) {
    // return false;
    // }
    // }

    // return true;
  }
  // public static boolean execute(int[] target, int[] arr) {

  // Map<Integer, Integer> count = new HashMap<>();

  // for (int i = 0; i < target.length; i++) {
  // int c = target[i];
  // int c2 = arr[i];

  // if (!count.containsKey(c)) {
  // count.put(c, 1);
  // } else {
  // count.put(c, count.get(c) + 1);
  // }

  // if (!count.containsKey(c2)) {
  // count.put(c2, -1);
  // } else {
  // count.put(c2, count.get(c2) - 1);
  // }
  // }

  // var it = count.entrySet().iterator();

  // while (it.hasNext()) {
  // var entry = it.next();
  // if (entry.getValue() != 0) {
  // return false;
  // }
  // }

  // return true;
  // }

  public static boolean executeWithMap(int[] target, int[] arr) {
    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < target.length; i++) {
      int c = target[i];
      int c2 = arr[i];

      count.put(c, count.getOrDefault(c, 0) + 1);
      count.put(c2, count.getOrDefault(c2, 0) - 1);
    }

    for (var entry : count.entrySet()) {
      if (entry.getValue() != 0) {
        return false;
      }
    }

    return true;
  }

  public static boolean executeWithArray(int[] target, int[] arr) {
    // because the constraints are 1 <= target[i] <= 1000
    int[] count = new int[1000 + 1];
    int i;

    for (i = 0; i < target.length; i++) {
      count[target[i]]++;
      count[arr[i]]--;
    }

    for (i = 0; i < count.length; i++) {
      if (count[i] != 0) {
        return false;
      }
    }

    return true;
  }
}
