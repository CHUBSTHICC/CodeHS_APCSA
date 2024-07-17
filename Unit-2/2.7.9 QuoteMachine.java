import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for a quote
        // Ask for the author
        System.out.println("Enter a quote:");
        String quote = scanner.nextLine();
        String theQuote = "\"" + quote + "\"";
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        System.out.println("Enter the author of the quote:");
        String author = scanner.nextLine();
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
        System.out.println(theQuote + "\n" + author);
        
    }
}
