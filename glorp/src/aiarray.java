import java.util.Scanner;

public class aiarray {
  public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);

    String[] names = new String[5];
    double[][] marks = new double[5][5];
    double[] sum = new double[5];

    for (int i = 0; i < names.length; i++) {
      System.out.print("Name of student " + (i + 1) + "? ");
      names[i] = scanner.nextLine();

      double total = 0;
      for (int j = 0; j < 5; j++) {
        System.out.print("Insert mark " + (j + 1) + " for " + names[i] + ": ");
        while (!scanner.hasNextDouble()) {
          System.out.println("Invalid input. Please enter a number.");
          scanner.next(); // clear invalid input
        }
        marks[i][j] = scanner.nextDouble();
        total += marks[i][j];
      }
      scanner.nextLine(); // consume leftover newline
      sum[i] = total;
    }

    // Printing results
    for (int i = 0; i < 5; i++) {
      System.out.print(names[i] + ": ");
      for (int j = 0; j < 5; j++) {
        System.out.print(marks[i][j] + " ");
      }
      System.out.println("| Sum = " + sum[i]);
    }

    scanner.close();
  }
}
