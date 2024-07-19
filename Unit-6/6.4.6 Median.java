import java.util.*;
public class Median
{

    public static void main(String[] args)
    {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));
        
        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));
        
    }

    public static double median(int[] arr)
    {
        // your code goes here!
        Arrays.sort(arr);
        double val = 0;
        int forEven = 0;
        int forEven2 = 0;
        if (arr.length % 2 == 0)
        {
            forEven = (arr.length / 2) - 1;
            forEven2 = arr.length / 2;
            val = (double)((arr[forEven2] - arr[forEven]) / 2) + 0.5 + arr[forEven];
        }
        else
        {
            forEven = arr.length - 1;
            forEven2 = forEven / 2;
            val = arr[forEven2];
        }
        return val;
    }
}
