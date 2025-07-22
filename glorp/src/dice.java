import java.util.*;

public class dice {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int x = 0;
        System.out.println("how many rolls");
        int y = scanner.nextInt();
        scanner.nextLine();

        if (y > 6) {
            System.out.println("nah you gotta be crazy twin cause no one is doing allat");
            System.exit(0);
        }

        System.out.println("you rolled ");

        for (int i = 1; i <= y; i++) {
            x = random.nextInt(1, 7);
            roll(x);
            System.out.println();
        }

    }

    public static void roll(int x) {

        switch (x) {
            case 1:
                System.out.print("""

                        +-------+
                        |       |
                        |   •   |
                        |       |
                        +-------+
                              """);

                break;
            case 2:
                System.out.print("""

                        +-------+
                        | •     |
                        |       |
                        |     • |
                        +-------+
                              """);
                break;
            case 3:
                System.out.print("""

                        +-------+
                        | •     |
                        |   •   |
                        |     • |
                        +-------+
                              """);
                break;
            case 4:
                System.out.print("""

                        +-------+
                        | •   • |
                        |       |
                        | •   • |
                        +-------+
                              """);
                break;

            case 5:
                System.out.print("""

                        +-------+
                        | •   • |
                        |   •   |
                        | •   • |
                        +-------+
                              """);
                break;

            case 6:
                System.out.print("""

                        +-------+
                        | •   • |
                        | •   • |
                        | •   • |
                        +-------+
                            """);
                break;

            default:
                System.out.print("balls");
                break;
        }

    }
}
