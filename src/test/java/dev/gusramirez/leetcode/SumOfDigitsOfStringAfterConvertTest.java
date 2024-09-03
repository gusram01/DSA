package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumOfDigitsOfStringAfterConvertTest {
  @Test
  void testZbax() {
    var s = "zbax";
    var k = 2;

    var result = SumOfDigitsOfStringAfterConvert.execute(s, k);

    assertEquals(8, result);
  }

  @Test
  void testIiii() {
    var s = "iiii";
    var k = 1;

    var result = SumOfDigitsOfStringAfterConvert.execute(s, k);

    assertEquals(36, result);
  }

  @Test
  void testLeetcode() {
    var s = "leetcode";
    var k = 2;

    var result = SumOfDigitsOfStringAfterConvert.execute(s, k);

    assertEquals(6, result);
  }
}
