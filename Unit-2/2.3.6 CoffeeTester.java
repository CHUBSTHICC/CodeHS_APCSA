public class CoffeeTester
{
    public static void main(String[] args)
    {
        // Create Specialized Coffee
        Coffee latte = new Coffee(4, false, "soy");
        System.out.println(latte);
        
        // Create a default coffee
        // This should work after you create the default
        // constructor
        Coffee plain = new Coffee(2, true, "nonfat");
        System.out.println(plain);
        
        Coffee plainTwo = new Coffee();
        System.out.print(plainTwo);
    }
}
