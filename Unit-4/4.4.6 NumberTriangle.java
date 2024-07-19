public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        // Your code goes here!
        for(int x = 1; x <= 5; x++)
        {
            for(int j = 1; j <= x; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
