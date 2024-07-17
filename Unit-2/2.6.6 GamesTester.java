public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames num = new NumberGames(5.0);

        // Square the number
        // Print it out
        
        System.out.println(num.squareNumber());
        // Double the number
        // Print it out
        System.out.println(num.doubleNumber());
        // Square the number again
        // Print it out
        System.out.println(num.squareNumber());
        // Get the number and store the value
        // Print out your stored value 
        System.out.println(num.getNumber());
        // Get the number again then store and print
        // the value
        System.out.println(num.getNumber());
    }
}
