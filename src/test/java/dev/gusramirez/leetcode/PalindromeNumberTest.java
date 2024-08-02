package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
  @Test
  void testSimplePalindrome() {

    var expected = true;

    var result = PalindromeNumber.execute(121);

    assertEquals(result, expected);
  }

  @Test
  void testNegativePalindrome() {

    var expected = false;

    var result = PalindromeNumber.execute(-121);

    assertEquals(result, expected);
  }

  @Test
  void testBigPalindrome() {

    var expected = true;

    var result = PalindromeNumber.execute(123464321);

    assertEquals(result, expected);
  }
}
