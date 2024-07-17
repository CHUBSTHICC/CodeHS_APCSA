import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a movie rating (1.0 - 5.0): ");
        double rating = input.nextDouble();
        rating += 0.5;
        int ratingTwo = (int) rating;
        System.out.print("Rating rounded: " + ratingTwo);
    }
}
