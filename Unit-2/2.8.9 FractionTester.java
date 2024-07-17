import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        
        Fraction fraction = new Fraction(1,2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numerator:");
        int numer = scanner.nextInt();
        System.out.println("Enter the denominator:");
        int denom = scanner.nextInt();
        Fraction fractionTwo = new Fraction(numer, denom);
        //a/b + c/d = (a*d + b*c)/(b*d)
        int sumPtOne = (fraction.getNumerator() * fractionTwo.getDenominator() + fraction.getDenominator() * fractionTwo.getNumerator());
        int sumPtTwo= (fraction.getDenominator() * fractionTwo.getDenominator());
        Fraction fractionThree = new Fraction(sumPtOne, sumPtTwo);
        System.out.println(fraction.toString() + " + " + fractionTwo.toString() + " = " + fractionThree);
     
        //int mainFractNumer = 1;
        //int mainFractDenom = 2;
        //String mainFract = mainFractNumer + "/" + mainFractDenom;
        // Ask for input
        
        // Create a new Fraction with the user's input
        //String userFract = numer + "/" + denom;
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        //Fraction farct = new Fraction(numer, denom);
        //int superDenom = mainFractDenom * denom;
        //int superNumerPtOne = denom * mainFractNumer;
        //int superNumerPtTwo = numer * mainFractNumer;
        //int fullSuperNumer = superNumerPtOne + superNumerPtTwo;
        
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        //System.out.println(mainFractNumer + "/" + mainFractDenom + " + " + numer + "/" + denom + " = " + fullSuperNumer + "/" + superDenom);
    }
}
