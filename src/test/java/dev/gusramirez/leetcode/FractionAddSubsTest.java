package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FractionAddSubsTest {
  @Test
  void testPosNeg() {

    var result = FractionAddSubs.withStringFractions("-1/2+1/2");

    assertEquals(result, "0/1");
  }

  @Test
  void testMultiple() {
    var result = FractionAddSubs.withStringFractions("-1/2+1/2+1/3");

    assertEquals(result, "1/3");
  }

  @Test
  void testWithIntegers() {
    var result = FractionAddSubs.withStringFractions("4/2+8/2");

    assertEquals(result, "6/1");
  }

  @Test
  void testWithIntegersAndFractions() {
    var result = FractionAddSubs.withStringFractions("4/2+8/2+1/2");

    assertEquals(result, "7/1");
  }

  @Test
  void testWithIntegersAndFractionsNeg() {
    var result = FractionAddSubs.withStringFractions("4/2-8/2-1/2");

    assertEquals(result, "-5/2");
  }
}
