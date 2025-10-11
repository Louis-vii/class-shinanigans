package src;

public class loophomework {
 public static void main (String args[]){
        for (int i=1 ; i<=5 ; i ++){

            int j =1;
            while (j<=5) {
if (i==j) {
 System.out.print("*");
}
else if (i>j) {
    System.out.print("+");
    
}
else 
System.out.print("-");
                
                j++;
            }



            System.out.println();
        }


    }

    
}
