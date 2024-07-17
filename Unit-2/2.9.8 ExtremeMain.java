import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes ext = new Extremes();
        // Ask the user to guess the maximum value of an Integer
        System.out.println("What do you think the maximum int value is?");
        int guessMax = scanner.nextInt();
        // Compute and display what they'd need to multiply by
        // to reach the maximum number
        int multDiff = ext.maxQuotient(guessMax);
        System.out.println("You'd need to multiply your number by " + multDiff + " to reach tha max value!");
        // Ask the user to guess the minimum value of an Integer
        System.out.println("What do you think the minimum int value is?");
        int guessMin = scanner.nextInt();
        // Compute and display what they'd need to multiply by
        // to reach the minimum number
        int multDiffMin = ext.minQuotient(guessMin);
        System.out.println("You'd need to multiply your number by " + multDiffMin + " to reach the min value!");
    }
}
