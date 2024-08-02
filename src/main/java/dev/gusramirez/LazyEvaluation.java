package dev.gusramirez;

import java.util.List;

public class LazyEvaluation {
  public static void run() {
    lazyEvaluation();
  }

  public static void lazyEvaluation() {
    int[] factor = new int[] { 2 };

    var numbers = List.of(1, 2, 3);

    var stream = numbers.stream()
        .map((num -> num * factor[0]));

    factor[0] = 0;

    stream.forEach(System.out::print);
    /*
     * it prints 000 because
     * the map of the stream only evaluates the expression
     * but the execution occurs when the forEach is called
     * i.e. only executed whitin the forEach
     * as a result the evaluation is lazy
     */
  }

}
