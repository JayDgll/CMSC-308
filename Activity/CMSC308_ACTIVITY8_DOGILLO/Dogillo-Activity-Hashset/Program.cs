using System;
using System.Collections.Generic;
class CFG
{
    static public void Main()
    {
        HashSet<int> mySet1 = new HashSet<int>(5);
        HashSet<int> mySet2 = new HashSet<int>(5);
        bool cando = true;
        do
        {
            try
            {
                int i, j;
                Console.WriteLine("===HashSet 1===");
                for (i = 0; i != 5; i++)
                {
                    Console.Write("\nElement " + i + " : ");
                    int inp1 = Convert.ToInt32(Console.ReadLine());
                    mySet1.Add(inp1);
                }
                Console.WriteLine("\n===HashSet 2===");
                for (j = 0; j != 5; j++)
                {
                    Console.Write("\nElement " + j + " : ");
                    int inp2 = Convert.ToInt32(Console.ReadLine());
                    mySet2.Add(inp2);
                }
                HashSet<int> opr = mySet1.ToHashSet();
                Console.WriteLine("\nUnion");
                opr.UnionWith(mySet2);
                foreach (int k in opr)
                {
                    Console.Write(k + " ");
                }
                opr = mySet1.ToHashSet();
                Console.WriteLine("\nIntersection");
                opr.IntersectWith(mySet2);
                foreach (int l in opr)
                {
                    Console.Write(l + " ");
                }
                opr = mySet1.ToHashSet();
                Console.WriteLine("\nSet Difference");
                opr.ExceptWith(mySet2);
                foreach (int m in opr)
                {
                    Console.Write(m + " ");
                }
                Console.WriteLine("\n");
                HashSet<int> opr2 = mySet2.ToHashSet();
                opr2.ExceptWith(mySet1);
                foreach (int m in opr2)
                {
                    Console.Write(m + " ");
                }
                Console.WriteLine();
                Console.ReadKey();
                Console.Clear();
            }
            catch (Exception j)
            {
                Console.WriteLine("\nInput Invalid");
                Console.ReadKey();
                Console.Clear();
            }
        }
        while (cando != true);
    }
}
