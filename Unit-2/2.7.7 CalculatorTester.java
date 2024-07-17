import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two doubles");
        double dobOne = scanner.nextDouble();
        double dobTwo = scanner.nextDouble();
        Calculator calc = new Calculator();
        
        System.out.println(dobOne + " + " + dobTwo + " = " + calc.sum(dobOne, dobTwo));
        System.out.println(dobOne + " - " + dobTwo + " = " + calc.subtract(dobOne, dobTwo));
        System.out.println(dobOne + " * " + dobTwo + " = " + calc.multiply(dobOne, dobTwo));
        System.out.println(dobOne + " / " + dobTwo + " = " + calc.divide(dobOne, dobTwo));
    }
}
