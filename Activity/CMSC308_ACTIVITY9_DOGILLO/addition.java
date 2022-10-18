import java.util.Scanner;

public class addition 
{
    Scanner scnn = new Scanner(System.in);
    public void add()
    {
      System.out.println("Enter 2 Numbers:");
      int num1 = scnn.nextInt();
      int num2 = scnn.nextInt();
      int result = num1 + num2; 
      System.out.println(result);

    }
}
