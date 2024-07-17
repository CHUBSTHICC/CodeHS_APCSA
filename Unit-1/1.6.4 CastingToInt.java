import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter a double:");
        double inputZero = myInput.nextDouble();
        System.out.println(inputZero);
        int inputOne = (int) inputZero;
        System.out.println(inputOne);
        double inputTwo = inputZero + 0.5;
        System.out.println(inputTwo);
        int inputThree = (int) inputTwo;
        System.out.println(inputThree);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double inputZero = input.nextDouble();
        System.out.println(inputZero);
        int inputOne = (int) inputZero;
        System.out.println(inputOne);
        double inputTwo = inputOne + 0.5;
        System.out.println(inputTwo);
        int inputThree = (int) inputTwo;
        System.out.print(inputThree);
        
    }
}
