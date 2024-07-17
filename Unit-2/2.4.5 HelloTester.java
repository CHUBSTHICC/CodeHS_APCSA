import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
       
        Hello myName = new Hello(name);
        System.out.println(name);

        myName.english();
        myName.spanish();
        myName.chinese();
    }
}
