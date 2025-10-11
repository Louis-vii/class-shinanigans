package src;


import java.util.*;

public class pluh {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int i = 1;
    double vact = 1;
    System.out.println("the number in mind is ?");
    int n = scanner.nextInt();

    while (i <= n) {
      vact *= i;
      i++;
    } // while

    System.out.println("vact is = " + vact);
    scanner.close();

  } // main
} // class
