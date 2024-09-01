package dev.gusramirez.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert1DTo2DArray {
  public static int[][] execute(int[] original, int m, int n) {

    var lengthValidation = m * n;

    if (original.length < lengthValidation) {
      return new int[][] {};
    }

    List<int[]> result = new ArrayList<>();

    for (int i = 0; i < m; i++) {
      var start = i * n;
      var end = (i + 1) * n;

      if (i * n > original.length) {
        break;
      }
      var slice = Arrays.copyOfRange(original, start, end);
      result.add(slice);
    }

    int[][] some = result.stream().toArray(int[][]::new);

    return some;
  }

}
