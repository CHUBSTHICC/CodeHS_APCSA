public class FallingBodies
{
    public static void main(String[] args)
    {
        double height = (0.5 * 9.8) * (23 * 23);
        System.out.print("Height = ");
        System.out.println(height);
        
        double velocity = 9.8 * 23;
        System.out.print("Velocity = ");
        System.out.println(velocity);
        System.out.print("The total height is: ");
        System.out.println(velocity + " meters.");
    }
}
