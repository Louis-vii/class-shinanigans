
import java.util.*;

public class anditsikemybrotha {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int x;
            int z;
            char y;
             
            System.out.println("what's x ");
            x=scanner.nextInt();
            System.out.println("what's z ");
            z=scanner.nextInt();
            System.out.println("whats the symbol ");
            y=scanner.next().charAt(0);
           
            switch (y) {
                case '-': System.out.println(x-z);
                break;
                case '+': System.out.println(x+z);
                
                case '*' : System.out.println( x * z );
                break;
                case '/': if (z !=0 ) System.out.println( x/z);
                else System.out.println(" error ");
                break;
                default: System.out.println("error");
            }     
            scanner.close();
          }
System.exit(0);
    }

    
}
