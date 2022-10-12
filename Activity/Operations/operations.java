import java.util.Scanner;

public class operations {
    public static void main(String[] args) throws Exception
    {
        boolean cando = false;
        Scanner scn = new Scanner(System.in);
        
        do 
        {
            System.out.println("\nCalculator Menu");
            System.out.println("\n[1] Addition");
            System.out.println("[2] Subraction");
            System.out.println("[3] Multiplication");
            System.out.println("[4] Division");
            System.out.println("[5] Exponent");
            System.out.println("[6] Modulo");
            System.out.println("[7] Exit ");
            
            try 
            {
                System.out.println("\nChoose an operation:");
                int opr = Integer.parseInt(scn.next());

                switch(opr)
                {
                case 1:
                    System.out.println("= ADDITION =");
                    System.out.print("Enter the Augend: ");
                    int aug = scn.nextInt();
                    System.out.print("Enter the Addend: ");
                    int add = scn.nextInt();
                    int total = aug + add;
                    System.out.println("The sum of " + aug + " and " + add + " is " + total);
                    break;

                case 2:
                    System.out.println("= SUBTRACTION =");
                    System.out.print("Enter the Minuend: ");
                    int min = scn.nextInt();
                    System.out.print("Enter the Subtrahend: ");
                    int sub = scn.nextInt();
                    int diff = min - sub;
                    System.out.println("The difference of " + min + " and " + sub + " is " + diff);
                    break;

                case 3:
                    System.out.println("= MULTIPLICATION =");
                    System.out.print("Enter the Multiplicand: ");
                    int mul = scn.nextInt();
                    System.out.print("Enter the Multiplier: ");
                    int mult = scn.nextInt();
                    int prod = mul * mult;
                    System.out.println("The product of " + mul + " and " + mult + " is " + prod);
                    break; 

                case 4:
                    System.out.println("= DIVISION =");
                    System.out.print("Enter the Dividend: ");
                    int div = scn.nextInt();
                    System.out.print("Enter the Divisor: ");
                    int dvis = scn.nextInt();
                    int quo = div / dvis;
                    System.out.println("The quotient of " + div + " and " + dvis + " is " + quo);
                    break; 

                case 5:
                    System.out.println("= EXPONENT =");
                    System.out.print("Enter the Base: ");
                    double bas = scn.nextInt();
                    System.out.print("Enter the Exponent: ");
                    double exp = scn.nextInt();
                    double tot = Math.pow(bas, exp);
                    System.out.println("The result of " + bas + " and " + exp + " is " + tot);
                    break;

                case 6:
                    System.out.println("= MODULO =");
                    System.out.print("Enter the Numerator: ");
                    int num = scn.nextInt();
                    System.out.print("Enter the Denominator: ");
                    int den = scn.nextInt();
                    int rem = num % den;
                    System.out.println("The remainder of " + num + " and " + den + " is " + rem);
                    break;

                case 7:
                    cando = true;
                    System.out.print("\nThank You Very Much!");
                    break;

                default:
                System.out.print("\nInvalid Input");
                }
            }
            catch (Exception q)
            {
                System.out.print("Invalid Input");
                
                //System.out.print(q);
            }
        }
        while (cando != true);
    }
}
