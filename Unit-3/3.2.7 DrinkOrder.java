import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        
        System.out.println("What do you want to drink?");
        String drink = scanner.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int tspoons = scanner.nextInt();
        System.out.println("Confirming your order. You wanted:");
        if (tspoons > 0)
        {
            System.out.println(drink + " with sugar");
        }
        if (tspoons == 0)
        {
            System.out.println(drink);
        }
    }
}
