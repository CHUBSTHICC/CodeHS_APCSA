import java.util.Scanner;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How much does dinner cost? ");
        double yourDinner = input.nextDouble();
        double theirDinner = yourDinner * 2;
        double dinner = yourDinner + theirDinner;
        System.out.print("How much does laser tag cost for one person? ");
        double laserTag = input.nextDouble();
        laserTag += laserTag;
        System.out.print("How much does a triple scoop cost? ");
        double tripleScoop = input.nextDouble();
        double theirScoop = tripleScoop / 3;
        double totalScoop = tripleScoop + theirScoop;
        System.out.println(" ");
        System.out.println("Dinner = $" + dinner);
        System.out.println("Laser Tag  = $" + laserTag);
        System.out.println("Ice cream = $" + totalScoop);
        double grandTotal = dinner + laserTag + totalScoop;
        System.out.print("Grand Total is $" + grandTotal);
    }
}
