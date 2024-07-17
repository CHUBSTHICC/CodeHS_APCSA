import java.util.Scanner;

public class ConstructionTester
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        double sTax = scanner.nextDouble();
        System.out.println("How many boards do you need?");
        int boardsTotal = scanner.nextInt();
        System.out.println("How many windows do you need?");
        int windowsTotal = scanner.nextInt();
        Construction build = new Construction(8, 11, sTax);
        double bigTotal = build.lumberCost(boardsTotal)  + build.windowCost(windowsTotal);
        System.out.println("Total: " + bigTotal);
        System.out.println("Grand Total: " + build.grandTotal(bigTotal));
        
    }
}
