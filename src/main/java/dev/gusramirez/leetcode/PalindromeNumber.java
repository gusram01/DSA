package dev.gusramirez.leetcode;

/* Given an integer x, return true if x is a palindrome, and false otherwise */
public class PalindromeNumber {

  public static boolean execute(int x) {

    int reversed = reverseInt(x);

    return x == reversed;
  }

  private static int reverseInt(int x) {

    var reversed = 0;

    while (x > 0) {
      reversed = reversed * 10 + x % 10;
      x = x / 10;
    }
    return reversed;
  }

}
