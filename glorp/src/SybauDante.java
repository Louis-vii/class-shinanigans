package src;

import java.util.Scanner;

public class SybauDante {
    public static void main(String[] args) {   
      

        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("what's num");
            double num = scanner.nextInt();
            
            if (num%2==0) {
                System.out.println("even");
            }
            else System.out.println("odd");
            
            System.exit(0);
            scanner.close();
        }

}
}

    
    

