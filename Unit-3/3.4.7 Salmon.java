import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask user for month of year as an integer
        System.out.println("Enter a month of the year as an integer");
        int month = scanner.nextInt();
        // Use if/else if/else statement to determine if it is spawning season
        if (month <= 2 || month == 7 || month == 8 || month == 12)
        {
            System.out.println("Not spawning season");
        }
        else if (month >= 3 && month <= 6)
        {
            System.out.println("Spring spawning season");
        }
        else
        {
            System.out.println("Fall spawning season");
        }
    }
}
