package src;

import java.util.*;
public class loopthing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int avg;
        int i=1;
        int n;
        int sum = 0;
        int mark=0;
//number of objects
        System.out.println("number");        
n = sc.nextInt();
//while loop to count the avg for the objects 
while(i<=n){
System.out.println("enter mark ");
mark=sc.nextInt();

sum+=mark;
        i++;
        }
        //print the avg of the while loop 
 avg = sum/n;
  System.out.println("the avg is " + avg);

}

}
 
