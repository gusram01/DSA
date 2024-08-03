package dev.gusramirez;

import dev.gusramirez.codingInterview.Permutation;

public class Main {
    public static void main(String[] args) {

        var s = "A bat is a cat";
        var s2 = "Acat is a bat";

        var isPermutation = Permutation.check(s, s2);
        System.out.println(isPermutation);

    }

}
