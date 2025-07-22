import java.util.*;

public class dice {
    public static void main(String args[]) {

        Random random = new Random();
        int x = random.nextInt(1, 7);

        System.out.println("you rolled a ");
        roll(x);

    }

    public static void roll(int x) {

        switch (x) {
            case 1:
                System.out.println("""

                        +-------+
                        |       |
                        |   •   |
                        |       |
                        +-------+


                              """);

                break;
            case 2:
                System.out.println("""

                        +-------+
                        | •     |
                        |       |
                        |     • |
                        +-------+


                              """);
                break;
            case 3:
                System.out.println("""


                        +-------+
                        | •     |
                        |   •   |
                        |     • |
                        +-------+

                              """);
                break;
            case 4:
                System.out.println("""

                        +-------+
                        | •   • |
                        |       |
                        | •   • |
                        +-------+
                              """);
                break;

            case 5:
                System.out.println("""

                        +-------+
                        | •   • |
                        |   •   |
                        | •   • |
                        +-------+
                              """);
                break;

            case 6:
                System.out.println("""

                        +-------+
                        | •   • |
                        | •   • |
                        | •   • |
                        +-------+
                            """);
                break;

            default:
                System.out.println("balls");
                break;
        }

    }
}
