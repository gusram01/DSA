package dev.gusramirez.narasimha;

public class Hanoi {
  public static void run(int n, char frompeg, char topeg, char auxpeg) {
    /* If only 1 disk, make the move and return */
    if (n == 1) {
      System.out.println("Move disk 1 from peg " + frompeg + " to peg " + topeg);
      return;
    }
    /* Move top n-1 disks from A to B, using C as auxiliary */
    run(n - 1, frompeg, auxpeg, topeg);
    /* Move remaining disks from A to C */
    System.out.println("Move disk from peg" + frompeg + " to peg " + topeg);
    /* Move n-1 disks from B to C using A as auxiliary */
    run(n - 1, auxpeg, topeg, frompeg);
  }

}
