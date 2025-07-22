
import java.util.*;

public class ta {
  public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("choose between 1 and 100");

      int num = scanner.nextInt();

      if (num > 50 && num <= 100) {
        for (int i = 1; i < 100; i++) {
          System.out.println("balls");
        }
      } else
        for (int i = 1; i < 100; i++) {
          System.out.println("cock");

        }
      scanner.close();
    }

  }
}
