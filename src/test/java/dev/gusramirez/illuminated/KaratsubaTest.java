package dev.gusramirez.illuminated;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KaratsubaTest {
  @Test
  void testExecuteWithRecusion() {

    var first = 5678;
    var second = 1234;

    int result = Karatsuba.executeWithRecursion(first, second);

    assertEquals(result, 7006652);
  }
}
