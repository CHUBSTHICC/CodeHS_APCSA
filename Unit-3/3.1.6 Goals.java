import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        
        // Ask for goal amount
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your goal:");
        int goal = scanner.nextInt();
        // Ask for actual amount
        System.out.println("Enter your actual amount:");
        int actual = scanner.nextInt();
        // Compare numbers by creating three booleans
        boolean overGoal = actual > goal;
        boolean notMeetGoal = goal > actual;
        boolean exactGoal = goal == actual;
        // Display results as instructed
        System.out.println("Went over goal? " + overGoal);
        System.out.println("Did not meet goal? " + notMeetGoal);
        System.out.println("Met goal exactly? " + exactGoal);
    }
}
