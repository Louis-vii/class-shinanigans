package src;

import java.util.Scanner;

public class balls {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {

            String name = scanner.nextLine();
            switch (name) {
                case "loui":
                    System.out.println("name ");
                    break;
                default:
                    System.out.println("no ");

            }
        }

    }
}
