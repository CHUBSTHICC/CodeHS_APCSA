public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        // Your code goes here!!!
        int spacer = 9;
        for (int x = 0; x < 10; x++)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print(" ");
            }
            for (int z = 0; z < spacer; z++)
            {
                System.out.print("* ");
            }
            System.out.println();
            spacer--;
        }
    }
}
