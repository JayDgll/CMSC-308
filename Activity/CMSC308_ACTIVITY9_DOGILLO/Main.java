import java.util.Scanner;

class Main
{
    public static void Main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Operations");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int opr = scn.nextInt();

        switch(opr)
        {
            case 1:
                addition addob = new addition();
                addob.add();
                
            case 2:
                Subtraction subob = new Subtraction();

            case 3:
                Multiplication mulob = new Multiplication();
                
            case 4:
                Divide divob = new Divide();

        }

    }
}