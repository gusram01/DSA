package dev.gusramirez.codingInterview;

import java.util.HashMap;

/**
 * Is Unique: Implement an algorithm to determine if a string
 * has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUnique {

  public static boolean execute(String str) {

    HashMap<Character, Integer> chars = new HashMap<>();

    if (str == null) {
      throw new RuntimeException("String cannot be null");
    }

    for (char c : str.toCharArray()) {
      if (chars.containsKey(c)) {
        return false;
      }

      chars.put(c, 1);
    }

    return true;
  }

  /* There is a restriction over the length of the entry string */
  public static boolean executeWithBitVector(String str) {
    int checker = 0;

    for (char c : str.toCharArray()) {
      int currentBit = c - 'a';

      /* shift the bit one step to the left */
      var shifted = 1 << currentBit;

      var shiftedChecker = checker & shifted;
      var isAlreadyStored = shiftedChecker > 0;

      if (isAlreadyStored) {
        return false;
      }

      checker |= (1 << currentBit);
    }

    return true;
  }

}
