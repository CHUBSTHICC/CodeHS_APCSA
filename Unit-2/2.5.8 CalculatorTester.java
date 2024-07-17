import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter two doubles");
        double dOne = scanner.nextDouble();
        double dTwo = scanner.nextDouble();
        calc.add(dOne, dTwo);
        calc.subtract(dOne, dTwo);
        calc.multiply(dOne, dTwo);
        calc.divide(dOne, dTwo);
    }
}
