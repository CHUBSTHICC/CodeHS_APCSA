import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        if (divisor != 0 && dividend / divisor > 0)
        {
            System.out.println(dividend + " is divisible by " + divisor + "!");
        }
        else
        {
            System.out.println(dividend + " is not divisible by " + divisor + "!");
        }
        
    }
}
