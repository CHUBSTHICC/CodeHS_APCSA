public class CoinTester
{
    public static void main(String[] args) 
    {
       // Create your program here
       System.out.print("Your total amount of coins is: ");
       Coins change = new Coins(3, 2, 1, 4);
       change.bankCount();
       System.out.print("Your total bank value is: ");
       change.bankValue();
       System.out.println("Remember, you need to get to $1.67 with 16 coins!");
       change.addQuarter();
       change.bankValue();
       change.bankCount();
       change.addQuarter();
       change.bankValue();
       change.bankCount();
       change.addDime();
       change.bankValue();
       change.bankCount();
       change.addPenny();
       change.bankValue();
       change.bankCount();
       change.addPenny();
       change.bankValue();
       change.bankCount();
       change.addPenny();
       change.bankCount();
       change.bankValue();
    }
}
