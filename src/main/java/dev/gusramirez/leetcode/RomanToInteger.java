package dev.gusramirez.leetcode;

import java.util.HashMap;

public class RomanToInteger {

  public static int execute(String s) {
    HashMap<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);
    var chars = s.toCharArray();

    int result = 0;
    int it = chars.length - 1;

    while (it >= 0) {

      int current = romanMap.get(chars[it]);

      if (it == 0) {
        result += current;
        break;
      }

      int previous = romanMap.get(chars[it - 1]);

      if (current <= previous) {
        result += current;
        it--;
      } else {
        result += current - previous;
        it -= 2;
      }
    }

    return result;
  }

}
