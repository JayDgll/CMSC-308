
import java.util.Scanner;

public class grades
{
    public static void main(String[] args) 
        {
            Scanner inp = new Scanner(System.in);
            System.out.println("\nGrades");

            System.out.print("\nEnglish   : ");
            double grad1 = inp.nextDouble();
            System.out.print("Filipino  : ");
            double grad2 = inp.nextDouble();
            System.out.print("Math      : ");
            double grad3 = inp.nextDouble();
            System.out.print("Science   : ");
            double grad4 = inp.nextDouble();

            double total = ((grad1 + grad2 + grad3 + grad4) / 4) ;
            System.out.println("\nAverage: " + total);
            if (total > 100)
            {
                System.out.println("Invalid Grade");
            }
            else if (total >= 98 && total  <= 100)
            {
                System.out.println("With Highest Honors");
            }
            else if (total >= 95 && total  <= 97.99)
            {
                System.out.println("With High Honors");
            }
            else if (total >= 90 && total  <= 94.99)
            {
                System.out.println("With Honors");
            }
            else if (total >= 75 && total  <= 89.99)
            {
                System.out.println("Passed");
            }
            else
            {
                System.out.println("Failed");
            } 
            System.out.println("\n");
            inp.close();
        }
}
        
  
