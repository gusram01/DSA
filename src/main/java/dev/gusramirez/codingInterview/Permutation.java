package dev.gusramirez.codingInterview;

import java.util.HashMap;
import java.util.Map;

public class Permutation {

  public static boolean check(String s1, String s2) {

    if (s1.length() != s2.length()) {
      return false;
    }

    Map<Integer, Integer> count = new HashMap<>();

    for (int i = 0; i < s1.length(); i++) {
      int c = s1.charAt(i);
      int c2 = s2.charAt(i);

      if (!count.containsKey(c)) {
        count.put(c, 1);
      } else {
        count.put(c, count.get(c) + 1);
      }

      if (!count.containsKey(c2)) {
        count.put(c2, -1);
      } else {
        count.put(c2, count.get(c2) - 1);
      }
    }

    var it = count.entrySet().iterator();

    while (it.hasNext()) {
      var entry = it.next();
      if (entry.getValue() != 0) {
        return false;
      }
    }

    return true;
  }

}
