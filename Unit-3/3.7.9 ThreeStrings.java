import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your password:");
        String pass = scanner.nextLine();
        System.out.println("Enter the company's secret code:");
        String code = scanner.nextLine();
        if (companyCode.equals(code))
        {
            System.out.println("Access granted");
        }
        else
        {
            System.out.println(pass + code + " is denied");
        }
        
        // Use comments to organize your logic before you start coding
        //my code here below
        
    }
}
