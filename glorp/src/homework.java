import java.util.*;

public class homework {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] array = new int[10];

    for (int i = 0; i < array.length; i++) {
      System.out.println("enter the array ");
      array[i] = scanner.nextInt();
    }

    PrintList(array);
    System.out.println();
    System.out.println("the sum of the even numbers is = " + SumEven(array));

    scanner.close();
  }

  public static void PrintList(int array[]) {
    System.out.println("the array contains :");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");

    }
  }

  public static int SumEven(int array[]) {

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0)
        sum += array[i];
    }
    return sum;
  }
}
