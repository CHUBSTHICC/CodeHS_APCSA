public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        while (num > 0)
        {
            double num2 = num;
            num2 = num2 / 10;
            num = num / 10;
            double num3 = num2 - num;
            num3 = num3 * 10;
            num3 = (int) Math.round(num3);
            num3 = (int) num3;
            System.out.println((int) num3);
        }
        
    }
}
