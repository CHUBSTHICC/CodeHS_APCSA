public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
        int count = 0;
        double total = 0;
        for (int value : values)
        {
            count++;
            total += value;
        }
        return (total / count);
   }
}
