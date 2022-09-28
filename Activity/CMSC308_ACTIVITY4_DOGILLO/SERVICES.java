/* Online Java Compiler and Editor */

import java.io.IOException;
import java.util.Scanner;

public class SERVICES
{
   public static void main(String[] args) throws IOException 
   { 
      Scanner scn = new Scanner(System.in);
      boolean done= false;
      do
      {
         System.out.print("\nNo. of Test Cases: ");
         int tc = scn.nextInt();
         System.out.println("Uber & Grab");

         if (1 <= tc && tc <= 10)
         {
            String inpts[] = new String[tc];
            for(int i = 0; i < tc; i++)
            {
               scn = new Scanner(System.in);
               inpts[i] = scn.nextLine();
            }
            System.out.println();
            System.out.println("\nResult: ");
            System.lineSeparator();

            for(String inpt : inpts)
               System.out.println(processInput(inpt));
            
            done = true;
         } 
         else 
            System.out.println("\nInputs must be 1-10 only");
      }
      while (!done);
      scn.close();
   }
   private static String processInput(String input)
   {
      String[] inpts = input.split("\\s+");

      if (inpts.length !=2)
      return "INVALID INPUT";

      try
      {
         int UBER = Integer.parseInt(inpts[0]);
         int GRAB = Integer.parseInt(inpts[1]);

         if (UBER < GRAB)
            return "FIRST";
        else if (UBER > GRAB)
            return "SECOND";
         else 
            return "ANY"; 
      }
      catch (Exception e)
      {
         return "INVALID INPUT";
      }
   }
}