import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score? ");
        int points = scanner.nextInt();
        System.out.println("How many rebounds did you get? ");
        int rebounds = scanner.nextInt();
        System.out.println("How many assists did you have? ");
        int assists = scanner.nextInt();
        // Create three boolean variables that
        // check if the stats are 10 or more
        boolean point = points >= 10;
        boolean rebound = rebounds >= 10;
        boolean assist = assists >= 10;
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        System.out.println("You got 10 or more points: " + point);
        System.out.println("You got 10 or more rebounds: " + rebound);
        System.out.println("You got 10 or more assists: " + assist);
        
    }
}
