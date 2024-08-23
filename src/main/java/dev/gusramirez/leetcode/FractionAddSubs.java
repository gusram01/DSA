package dev.gusramirez.leetcode;

public class FractionAddSubs {

  public static String withStringFractions(String fractions) {

    String[] splits = fractions.split("((?=[-+]))");

    int denominator = 0;
    int numerator = 1;

    for (String split : splits) {

      var nums = split.split("/");

      var innerDen = Integer.parseInt(nums[0]);
      var innerNum = Integer.parseInt(nums[1]);

      var tempNum = numerator * innerNum;

      var firstDen = denominator * (tempNum / numerator);
      var sndDen = innerDen * (tempNum / innerNum);

      denominator = firstDen + sndDen;
      numerator = tempNum;
    }

    if (denominator == 0) {
      return "0/1";
    }

    var gcd = gcd(numerator, denominator);
    var absGcd = gcd < 0 ? -gcd : gcd;

    return (denominator / absGcd) + "/" + (numerator / absGcd);
  }

  private static int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
  }

}
