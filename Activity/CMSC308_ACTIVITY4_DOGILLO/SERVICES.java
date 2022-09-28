/* Online Java Compiler and Editor */

import java.io.IOException;
import java.util.Scanner;


public class SERVICES
{
   public static void main(String[] args) throws IOException 
   { 
      Scanner scn = new Scanner(System.in);
      int[] arr1 = new int[10];
      int[] arr2 = new int[10];
      int i, n;
      System.out.print("No. of Test Cases: ");
      n = scn.nextInt();
         System.out.println("Test Cases for Uber:");
         for (i = 0; i < n; i++)
         {
            arr1[i] = scn.nextInt(); 
         }
         System.out.println("Test Cases for Grab:");
         for (i = 0; i < n; i++)
         {
            arr2[i] = scn.nextInt(); 
         }
      System.out.println("Results:");
      if (n == 1) 
      {
         if (arr1[0] > arr2[0])
         {
            System.out.println("FIRST");
         }
         else if(arr1[0] == arr2[0])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
      }
      if (n == 2) 
      {
         if (arr1[0] > arr2[0])
         {
            System.out.println("FIRST");
         }
         else if(arr1[0] == arr2[0])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
         if (arr1[1] > arr2[1])
         {
            System.out.println("FIRST");
         }
         else if(arr1[1] == arr2[1])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
      }  
      if (n == 3) 
      {
         if (arr1[0] > arr2[0])
         {
            System.out.println("FIRST");
         }
         else if(arr1[0] == arr2[0])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
         if (arr1[1] > arr2[1])
         {
            System.out.println("FIRST");
         }
         else if(arr1[1] == arr2[1])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
         if (arr1[2] > arr2[2])
         {
            System.out.println("FIRST");
         }
         else if(arr1[2] == arr2[2])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
      }
      if (n == 4) 
      {
         if (arr1[0] > arr2[0])
         {
            System.out.println("FIRST");
         }
         else if(arr1[0] == arr2[0])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
         if (arr1[1] > arr2[1])
         {
            System.out.println("FIRST");
         }
         else if(arr1[1] == arr2[1])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
         if (arr1[2] > arr2[2])
         {
            System.out.println("FIRST");
         }
         else if(arr1[2] == arr2[2])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
         if (arr1[3] > arr2[3])
         {
            System.out.println("FIRST");
         }
         else if(arr1[3] == arr2[3])
         {
            System.out.println("ANY");
         }
         else
         {
            System.out.println("SECOND");
         }
      }
   }
}