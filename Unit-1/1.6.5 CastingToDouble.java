import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("First int: ");
        int intOne = input.nextInt();
        System.out.print("Second int: ");
        int intTwo = input.nextInt();
        double intThree = (double) intOne / intTwo;
        System.out.print(intThree);
    }
}
