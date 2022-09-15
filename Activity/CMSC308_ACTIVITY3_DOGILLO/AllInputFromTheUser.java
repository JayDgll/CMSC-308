
import java.util.Scanner;

public class AllInputFromTheUser 
{
    public static void main(String[] args) 
        {
            Scanner inp = new Scanner(System.in);
             
            System.out.println("Grade Computer");
            
            System.out.println("\nSubjects:");
            System.out.print("\n1st Subject: ");
            String sub1 = inp.nextLine();
            System.out.print("2nd Subject: ");
            String sub2 = inp.nextLine();
            System.out.print("3rd Subject: ");
            String sub3 = inp.nextLine();
            System.out.print("4th Subject: ");
            String sub4 = inp.nextLine();


            System.out.println("\nGrades");

            System.out.print("\n1st Grade: ");
            double grad1 = inp.nextDouble();
            System.out.print("2nd Grade: ");
            double grad2 = inp.nextDouble();
            System.out.print("3rd Grade: ");
            double grad3 = inp.nextDouble();
            System.out.print("4th Grade: ");
            double grad4 = inp.nextDouble();

            System.out.println("\n");
            System.out.println("--------------------------------------------------");
            System.out.println("\n" + sub1 + " : " + grad1);
            System.out.println(sub2 + " : " + grad2);
            System.out.println(sub3 + " : " + grad3);
            System.out.println(sub4 + " : " + grad4);

            
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
            inp.close();
        }
}
        
  
