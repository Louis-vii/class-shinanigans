
import java.util.*;

public class person {
  String name = "";
  Scanner scanner = new Scanner(System.in);
  static int age = 12;
  boolean ismale = true;

  void set_name(String name) {
    name = scanner.nextLine();
    this.name = name;
  }

  String get_name() {
    return name;
  }
}
