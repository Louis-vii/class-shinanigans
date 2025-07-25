
import java.util.*;

public class dice {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String israndom = "israndom";
        int x = 0;
        int y = 0;

        System.out.println("Random rolls or set number (R for random )");
        israndom = scanner.nextLine();
        if (israndom.equals("R")) {
            y = random.nextInt(1, 7);
            for (int i = 1; i <= y; i++) {
                x = random.nextInt(1, 7);
                roll(x);
            }
        } else {
            System.out.println("How many rolls (1,6)");
            y = scanner.nextInt();
            if (y > 6) {
                System.out.println("I said between 1 and 6 you retard ");
                System.exit(0);
            }
            for (int i = 1; i <= y; i++) {
                x = random.nextInt(1, 7);
                roll(x);
            }

        }

        scanner.close();
    }

    public static void roll(int x) {

        switch (x) {
            case 1:
                System.out.print("""
                            ____________
                           /           /|
                          /           / |
                         /           /  |
                        /           /   |
                        ------------    |
                        |           |   |
                        |           |   |
                        |    ●      |  /
                        |           | /
                         ----------- /
                                       """);

                break;
            case 2:
                System.out.print("""
                             ____________
                           /           /|
                          /           / |
                         /           /  |
                        /           /   |
                        ------------    |
                        |  ●        |   |
                        |           |   |
                        |           |  /
                        |        ●  | /
                         ----------- /

                                        """);
                break;
            case 3:
                System.out.print("""
                            ____________
                           /           /|
                          /           / |
                         /           /  |
                        /           /   |
                        ------------    |
                        |  ●        |   |
                        |    ●      |   |
                        |      ●    |  /
                        |           | /
                         ----------- /

                                        """);
                break;
            case 4:
                System.out.print("""
                            ____________
                           /           /|
                          /           / |
                         /           /  |
                        /           /   |
                        ------------    |
                        |  ●      ● |   |
                        |           |   |
                        |           |  /
                        |  ●      ● | /
                         ----------- /

                                        """);
                break;

            case 5:
                System.out.print("""
                            ____________
                           /           /|
                          /           / |
                         /           /  |
                        /           /   |
                        ------------    |
                        | ●       ● |   |
                        |           |   |
                        |     ●     |  /
                        |  ●      ● | /
                         ----------- /

                                        """);
                break;

            case 6:
                System.out.print("""

                            ____________
                           /           /|
                          /           / |
                         /           /  |
                        /           /   |
                        ------------    |
                        | ●       ● |   |
                        |           |   |
                        | ●       ● |  /
                        | ●       ● | /
                         ----------- /


                                                                                                         """);
                break;

            default:
                System.out.print("balls");
                break;
        }

    }

}
