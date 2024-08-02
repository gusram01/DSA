package dev.gusramirez.codingInterview;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class IsUniqueTest {
  @Test
  void abcIsUnique() {

    var entry = "abc";

    var result = IsUnique.execute(entry);

    assertTrue(result, "abc entry expects has all unique characters");
  }

  @Test
  void abcIsUniqueWithBitVector() {

    var entry = "abc";

    var result = IsUnique.executeWithBitVector(entry);

    assertTrue(result, "abc entry expects has all unique characters");
  }

  @Test
  void aabIsNotUnique() {

    var entry = "aab";

    var result = IsUnique.execute(entry);

    assertTrue(!result, "aab entry expects has not all unique characters");
  }

  @Test
  void emptyStringIsUnique() {

    var entry = "";

    var result = IsUnique.execute(entry);

    assertTrue(result, "empty string entry expects has all unique characters");
  }

  @Test
  void nullStringThrowsError() {

    String entry = null;

    var thrown = assertThrows(
        RuntimeException.class, () -> IsUnique.execute(entry));

    assertTrue(thrown.getMessage().equals("String cannot be null"),
        "null string entry expects has all unique characters");

  }

  @Test
  void veryLongStringIsUnique() {

    var entry = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    var result = IsUnique.execute(entry);

    assertTrue(result, "very long string entry expects has all unique characters");
  }

  @Test
  void veryLongStringIsUniqueWithBitVector() {
    /**
     * When a try to rerun after a failed test, the test fails again. This is
     * because the bit vector is not being reset. The bit vector is a static
     * variable, so it is shared among all the tests. This is a problem because the
     * bit vector is being used to store the state of the characters in the string.
     *
     */

    var entry = "abcdefghijklmnopqrstuvwxyz";

    var result = IsUnique.executeWithBitVector(entry);

    assertTrue(result, "very long string entry expects has all unique characters");
  }
}
