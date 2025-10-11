package src;

import java.util.*;

public class lilgame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] events = new String[4];

    System.out.println("event num1");
    events[0] = scanner.nextLine();
    System.out.println("event num 2 ");
    events[1] = scanner.nextLine();
    System.out.println(" event num 3 ");
    events[2] = scanner.nextLine();

    System.out.println(" hey there what about we go and do some " + events[0]);
    System.out.println("HOLY SHIT IT'S " + events[1]);
    System.out.println(" we got " + events[2] + "so hard ");

  }
}
