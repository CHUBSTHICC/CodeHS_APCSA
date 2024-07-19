import java.util.Scanner;

public class FindMedian 
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the median.
        int median = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int one = scanner.nextInt();
        System.out.println("Enter the second integer:");
        int two = scanner.nextInt();
        System.out.println("Enter the third integer:");
        int three = scanner.nextInt();
        if (one == two && two == three)
        {
            System.out.println("The median is " + one);
        }
        else if (one == two || two == three || one == three)
        {
            System.out.println("There is no median");
        }
        else if (one > two && two > three || three > two && two > one)
        {
            System.out.println("The median is " + two);
        }
        else if (one > three && three > two || two > three && three > one)
        {
            System.out.println("The median is " + three);
        }
        else if (two > one && one > three || three > one && one > two)
            System.out.println("The median is " + one);
    }
}
