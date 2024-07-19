import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sent = scanner.nextLine();
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println(useProperGrammar(sent));
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        String newText = "";
        
        int errorCount = 0;
        
        for (int x = 0; x < theText.length(); x++){
            String letter = theText.substring(x, x + 1);
            if (letter.equals("2")){
                newText += "to";
                errorCount += 1;
                }
            else{
                newText += letter;
                }
            }
        System.out.println("Fixed " + errorCount + " grammatical errors:");
        return newText;
    }
}
