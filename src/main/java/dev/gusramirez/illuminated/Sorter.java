package dev.gusramirez.illuminated;

import java.util.ArrayList;
import java.util.List;

public class Sorter {

  public static List<Integer> byMerge(List<Integer> list) {

    if (list.size() <= 1) {
      return list;
    }

    var middle = list.size() / 2;

    var left = list.subList(0, middle);
    var right = list.subList(middle, list.size());

    var leftSorted = byMerge(left);
    var rightSorted = byMerge(right);

    return merge(leftSorted, rightSorted);
  }

  private static List<Integer> merge(List<Integer> left, List<Integer> right) {
    int i = 0, j = 0;
    int total = left.size() + right.size();

    List<Integer> merged = new ArrayList<>();

    while (merged.size() < total) {
      if (i == left.size()) {
        merged.addAll(right.subList(j, right.size()));
        break;
      }

      if (j == right.size()) {
        merged.addAll(left.subList(i, left.size()));
        break;
      }

      if (left.get(i) < right.get(j)) {
        merged.add(left.get(i));
        i++;
      } else {
        merged.add(right.get(j));
        j++;
      }
    }

    return merged;
  }

}
