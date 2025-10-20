package src;

import java.util.*;

public class arrays {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    String[] names = new String[5];
    double[][] marks = new double[5][5];
    double[] sum = new double[5];

    for (int i = 0; i < names.length; i++) {
      System.out.println("name ? ");
      names[i] = scanner.nextLine();
      double total = 0;
      for (int j = 0; j < 5; j++) {
        System.out.println("insert five marks ");
        marks[i][j] = scanner.nextDouble();

        total += marks[i][j];

      }
      scanner.nextLine();
      sum[i] = total;
    }
    for (int i = 0; i < 5; i++) {
      System.out.print(names[i]);
      for (int j = 0; j < 5; j++)

        System.out.print(marks[i][j]);

      System.out.println("sum= " + sum[i]);

    }
  }
}
