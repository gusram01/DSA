package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class AreEqualByReversingSubarraysTest {
  @Test
  void oneToFour() {
    var target = new int[] { 1, 2, 3, 4 };
    var arr = new int[] { 2, 4, 3, 1 };

    var result = AreEqualByReversingSubarrays.execute(target, arr);

    assertTrue(result, "The arrays are equal by reversing subarrays");
  }

  @Test
  void differentItems() {
    var target = new int[] { 1, 2, 3, 4 };
    var arr = new int[] { 2, 4, 1, 5 };

    var result = AreEqualByReversingSubarrays.execute(target, arr);

    assertFalse(result, "The arrays are not equal by reversing subarrays");
  }

  @Test
  void validateForOneElement() {
    var target = new int[] { 1 };
    var arr = new int[] { 1 };

    var result = AreEqualByReversingSubarrays.execute(target, arr);

    assertTrue(result, "The arrays are equal by reversing subarrays");
  }

  @Test
  void validateRepeatedElements() {
    var target = new int[] { 1, 2, 2, 3 };
    var arr = new int[] { 1, 1, 2, 3 };

    var result = AreEqualByReversingSubarrays.execute(target, arr);

    assertFalse(result, "The arrays are NOT equal by reversing subarrays");
  }

  @Test
  void validateAllRepeatedElements() {
    int[] target = new int[5];
    Arrays.fill(target, 1);
    int[] arr = new int[5];
    Arrays.fill(arr, 1);

    var result = AreEqualByReversingSubarrays.execute(target, arr);

    assertFalse(result, "The arrays are NOT equal by reversing subarrays");
  }

  @Test
  void oneToFourWithArray() {
    var target = new int[] { 1, 2, 3, 4 };
    var arr = new int[] { 2, 4, 1, 3 };

    var result = AreEqualByReversingSubarrays.executeWithArray(target, arr);

    assertTrue(result, "The arrays are equal by reversing subarrays");
  }

  @Test
  void differentItemsWithArray() {
    var target = new int[] { 1, 2, 3, 4 };
    var arr = new int[] { 2, 4, 1, 5 };

    var result = AreEqualByReversingSubarrays.executeWithArray(target, arr);

    assertFalse(result, "The arrays are not equal by reversing subarrays");
  }

  @Test
  void validateForOneElementWithArray() {
    var target = new int[] { 1 };
    var arr = new int[] { 1 };

    var result = AreEqualByReversingSubarrays.executeWithArray(target, arr);

    assertTrue(result, "The arrays are equal by reversing subarrays");
  }

  @Test
  void validateRepeatedElementsWithArray() {
    var target = new int[] { 1, 2, 2, 3 };
    var arr = new int[] { 1, 1, 2, 3 };

    var result = AreEqualByReversingSubarrays.executeWithArray(target, arr);

    assertFalse(result, "The arrays are NOT equal by reversing subarrays");
  }
}
