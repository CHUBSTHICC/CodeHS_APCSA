import java.util.Scanner;

public class TalkerTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text here: ");
        String texto = scanner.nextLine();
        Talker talky = new Talker(texto); 
        String yelling = talky.outdoorVoice();
        String whispers = talky.indoorVoice();
        System.out.println(talky);
        System.out.println("Yelling: " + yelling);
        System.out.println("Whispering: " + whispers);
    }
}
