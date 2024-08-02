package dev.gusramirez;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExampleOne {

  public static void run() {
    lists();
    collections();
  }

  public static void lists() {
    List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));

    System.out.println(numbers); // [1,2,3]

    numbers.remove(1);

    System.out.println(numbers); // [1,3]
  }

  public static void collections() {
    Collection<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));

    System.out.println(numbers); // [1,2,3]

    numbers.remove(1);

    System.out.println(numbers); // [2,3]
  }
}
