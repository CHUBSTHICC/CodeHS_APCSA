import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("How tall are you? ");
        int inches = scanner.nextInt();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        if (age >= 9 && inches >= 42)
        {
            System.out.println("Welcome aboard!");
        }
        else
        {
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}
