package dev.gusramirez.illuminated;

import java.util.List;
import java.util.stream.Collectors;

public class Karatsuba {

  /*
   * Input: two n-digit positive integers x and y.
   * Output: the product x · y.
   * Assumption: n is a power of 2.
   */
  public static int executeWithRecursion(int x, int y) {
    if (x < 10 || y < 10) {
      return x * y;
    }

    var firstAsAList = toList(x);
    var sndAsAList = toList(y);

    var n = firstAsAList.size();
    var m = sndAsAList.size();

    if (m > n) {
      var diff = m - n;
      for (int i = 0; i < diff; i++) {
        firstAsAList.add(0, 0);
      }
    } else if (n > m) {
      var diff = n - m;
      for (int i = 0; i < diff; i++) {
        sndAsAList.add(0, 0);
      }
    }

    var max = Math.max(n, m);

    if (max % 2 != 0) {
      firstAsAList.add(0, 0);
      sndAsAList.add(0, 0);
    }

    var newSize = firstAsAList.size();

    var xHalves = getHalves(firstAsAList);
    var yHalves = getHalves(sndAsAList);

    var a = xHalves.get(0);
    var b = xHalves.get(1);

    var c = yHalves.get(0);
    var d = yHalves.get(1);

    var p = a + b;
    var q = c + d;

    var ac = executeWithRecursion(a, c);
    var bd = executeWithRecursion(b, d);
    var pq = executeWithRecursion(p, q);

    var adbc = pq - ac - bd;

    var result = Math.pow(10, newSize) * ac + Math.pow(10, newSize / 2) * adbc + bd;

    return (int) result;
  }

  private static List<Integer> toList(int number) {
    String numString = String.valueOf(number);

    List<Integer> result = numString
        .chars()
        .parallel()
        .map(Character::getNumericValue)
        .boxed()
        .collect(Collectors.toList());

    return result;
  }

  private static List<Integer> getHalves(List<Integer> list) {
    int size = list.size();
    int half = size / 2;

    List<Integer> firstHalf = list.subList(0, half);
    List<Integer> secondHalf = list.subList(half, size);

    var first = Integer.parseInt(firstHalf.stream()
        .parallel()
        .map(String::valueOf)
        .collect(Collectors.joining()));

    var second = Integer.parseInt(secondHalf.stream()
        .parallel()
        .map(String::valueOf)
        .collect(Collectors.joining()));

    return List.of(first, second);
  }

}
