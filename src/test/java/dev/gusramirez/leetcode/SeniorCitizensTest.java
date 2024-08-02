package dev.gusramirez.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SeniorCitizensTest {
  @Test
  void hasOne() {
    List<String> details = List.of("7868190130M5522", "5303914400F9211", "9273338290F4010");
    int result = SeniorCitizens.howMany(details);
    int expected = 1;

    assertEquals(expected, result);
  }

  @Test
  void countOnlyAbove60() {
    List<String> details = List.of("9751302862F0693", "3888560693F7262", "5485983835F0649", "2580974299F6042",
        "9976672161M6561", "0234451011F8013", "4294552179O6482");
    int result = SeniorCitizens.howMany(details);
    int expected = 4;

    assertEquals(expected, result);
  }

  @Test
  void expectNone() {
    List<String> details = List.of("1313579440F2036", "2921522980M5644");
    int result = SeniorCitizens.howMany(details);
    int expected = 0;

    assertEquals(expected, result);
  }
}
