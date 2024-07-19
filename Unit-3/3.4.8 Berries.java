import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        
        // Ask for a berry 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial of the berry:");
        String intial = scanner.nextLine();
        char berry = intial.charAt(0);
        // Remember the Scanner object will take whole strings
        // Extract the first character using charAt
        // Remember that characters can be compared using == 
        // Use comments to list the different
        // branches you will need before you write the code
        if (berry == 'E')
        {
            System.out.println("You ordered Elderberry");
        } 
        else if (berry == 'G')
        {
            System.out.println("You ordered Gooseberry");
        } 
        else if (berry == 'L')
        {
            System.out.println("You ordered Lingonberry");
        } 
        else
        {
            System.out.println("Berry not recognized");
        }
    }
}
