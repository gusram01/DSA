package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {
  @Test
  void test1994() {
    var s = "MCMXCIV";

    var result = RomanToInteger.execute(s);

    assertEquals(result, 1994);
  }

  @Test
  void test3() {
    var s = "III";

    var result = RomanToInteger.execute(s);

    assertEquals(result, 3);
  }
}
