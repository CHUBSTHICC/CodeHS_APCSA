import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start here!
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        if (num > 0)
        {
            System.out.println("The number is positive!");
        }
        else if (num < 0)
        {
            System.out.println("The number is negative!");
        }
        else
        {
            System.out.println("The number is neither positive nor negative!");
        }
    }
}
