package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubWoRepeatingCharsTest {
  @Test
  void max3withRepeatedPattern() {
    var e = "abcabcbb";

    var result = LongestSubWoRepeatingChars.bySlidingWindowWithSet(e);

    assertEquals(result, 3);
  }

  @Test
  void repeatedCharacter() {
    var e = "bbbbb";

    var result = LongestSubWoRepeatingChars.bySlidingWindowWithSet(e);

    assertEquals(result, 1);
  }

  @Test
  void max3withRepeatedPattern2() {
    var e = "pwwkew";

    var result = LongestSubWoRepeatingChars.bySlidingWindowWithSet(e);

    assertEquals(result, 3);
  }

  @Test
  void withSpaces() {
    var e = " ";

    var result = LongestSubWoRepeatingChars.bySlidingWindowWithSet(e);

    assertEquals(result, 1);
  }

  @Test
  void withRepeatedPattern() {
    var e = "dvdf";

    var result = LongestSubWoRepeatingChars.bySlidingWindowWithSet(e);

    assertEquals(result, 3);
  }
}
