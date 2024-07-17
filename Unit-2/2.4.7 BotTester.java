import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        Bot chatty = new Bot(name);
        System.out.println("Tell me Bot, which countries use the imperial system?");
        System.out.println("Tell me Bot, what was the first computer bug?");
        chatty.greeting();
        chatty.help();
        System.out.println("");
        String question = scanner.nextLine();
        System.out.println("");
        chatty.imperialCountries();
        System.out.println("");
        question = scanner.nextLine();
        System.out.println("");
        chatty.firstBug();
        System.out.println("");
        chatty.goodbye();
    }
}
