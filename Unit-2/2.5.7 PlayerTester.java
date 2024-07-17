public class PlayerTester
{
    public static void main(String[] args) 
    {
        System.out.println("Brian Lara's Stats: ");
        CricketPlayer cricket = new CricketPlayer("Brian Lara", "The Bobos");
        cricket.addMatch(4, 4);
        cricket.addMatch(34, 2);
        cricket.addMatch(5, 78);
        cricket.addMatch(43, 22);
        System.out.println(cricket);
        System.out.println("Bobo's Stats: ");
        CricketPlayer cricketTwo = new CricketPlayer("Bobo");
        cricket.printRunsScored();
        cricket.printBallsBowled();
        cricketTwo.addMatch(4, 4);
        cricketTwo.addMatch(0, 23);
        cricketTwo.addMatch(89, 3);
        cricketTwo.addMatch(9, 13);
        System.out.println(cricketTwo);
        cricketTwo.printRunsScored();
        cricketTwo.printBallsBowled();
    }
}
