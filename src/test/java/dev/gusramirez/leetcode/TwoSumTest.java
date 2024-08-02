package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {
  @Test
  void testFor6() {
    var entry = new int[] { 3, 2, 4 };

    var target = 6;

    var result = TwoSum.executeHash(entry, target);

    assertArrayEquals(result, new int[] { 1, 2 });

  }

  @Test
  void testFor9() {
    var entry = new int[] { 2, 7, 11, 15 };

    var target = 9;

    var result = TwoSum.executeHash(entry, target);

    assertArrayEquals(result, new int[] { 0, 1 });

  }

  @Test
  void testFor6a() {
    var entry = new int[] { 3, 3 };

    var target = 6;

    var result = TwoSum.executeHash(entry, target);

    assertArrayEquals(result, new int[] { 0, 1 });

  }

  @Test
  void testForNegative() {
    var entry = new int[] { -1, -2, -3, -4, -5 };

    var target = -8;

    var result = TwoSum.executeHash(entry, target);

    assertArrayEquals(result, new int[] { 2, 4 });

  }
}
