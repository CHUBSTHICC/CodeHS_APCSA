import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) 
    {
       // Start Here!
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        Bot2 bot = new Bot2(name);
        bot.greeting();
        System.out.println("What is your favorite animal?");
        String animal = scanner.nextLine();
        bot.favoriteAnimal(animal);
        System.out.println("If you could visit any place, where would you go?");
        String place = scanner.nextLine();
        bot.destination(place);
        System.out.println("What is your favorite number?");
        int num = scanner.nextInt();
        bot.favoriteNumber(num);
        bot.goodbye();
    }
}
