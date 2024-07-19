import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        
        // make user enter both players names
        System.out.println("Enter player one's name: ");
        String pOneName = scanner.nextLine();
        System.out.println("Enter player two's name: ");
        String pTwoName = scanner.nextLine();
        
        // make user enter player scores
        System.out.println("Enter " + pOneName + "'s score");
        int pOneScore = scanner.nextInt();
        System.out.println("Enter " + pTwoName + "'s score");
        int pTwoScore = scanner.nextInt();
        
        // compareTo method
        pOneName.compareTo(pTwoName);
        if (pOneName.compareTo(pTwoName) < 0)
        {
            System.out.println(pOneName + " scored " + pOneScore +  " points");
            System.out.println(pTwoName + " scored " + pTwoScore +  " points");
        }
        else
        {
            System.out.println(pTwoName + " scored " + pTwoScore + " points");
            System.out.println(pOneName + " scored " + pOneScore + " points");
        }
        
        if (pOneScore > pTwoScore)
        {
            System.out.println(pOneName + " wins!");
        }
        else if (pTwoScore > pOneScore)
        {
            System.out.println(pTwoName + " wins!");
        }
        else
        {
            System.out.println("Nobody wins.");
        }
    }
}
