import java.util.*;

public class spaghittycode {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int x;
    int y;

    System.out.println("the lengh of the first array = ");
    x = scanner.nextInt();
    System.out.println("the lengh of the second  array = ");
    y = scanner.nextInt();

    int a[] = new int[x];
    int b[] = new int[y];

    for (int i = 0; i < a.length; i++) {
      System.out.println("enter the first array ");
      a[i] = scanner.nextInt();

    }
    for (int j = 0; j < b.length; j++) {
      System.out.println("enter the second array ");
      b[j] = scanner.nextInt();

    }

    print(a, b);
    scanner.close();
  }

  public static void print(int u[], int c[]) {

    for (int i = 0; i < u.length; i++) {

      for (int j = 0; j < c.length; j++) {
        if (u[i] == c[j]) {
          System.out.print(u[i] + " ");
        }
      }

    }
  }
}
