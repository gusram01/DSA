package dev.gusramirez;

import java.util.Arrays;
import java.util.List;

public class ListOf {
  public static void run() {
    mutableList();

  }

  public static void mutableList() {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    System.out.println(numbers); // [1,2,3]

    try {
      numbers.add(4);
      System.out.println("add applied");
    } catch (Exception e) {

      System.out.println("add not applied");
    }

    try {
      numbers.set(2, 4);
      System.out.println("set applied");
    } catch (Exception e) {

      System.out.println("set not applied");
    }

    System.out.println(numbers);

  }

}
