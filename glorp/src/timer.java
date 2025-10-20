import java.util.*;

public class timer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    for (int i = n; i >= 0; i--) {

      System.out.println("time is " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {

      }
      if (i == 1) {
        System.out.println("balls");
      }
    }

  }
}
