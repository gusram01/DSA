package dev.gusramirez.leetcode;

import java.util.List;

public class SeniorCitizens {
  public static int howMany(List<String> details) {

    int count = 0;

    for (String detail : details) {
      int age1 = Character.getNumericValue(detail.charAt(11));
      int age2 = Character.getNumericValue(detail.charAt(12));

      if (age1 == 6 && age2 > 0) {

        count++;

      } else if (age1 > 6) {
        count++;
      }

    }

    return count;
  }

}
