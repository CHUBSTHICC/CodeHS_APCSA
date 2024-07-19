public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String[] cities = new String[]{"Las Vegas", "Minsk", "Sao Paulo"};
        int[] pop = new int[]{667501, 2038822, 12330000};
        double[] sunshine = new double[]{8.11, 1.36, 6.05};
      // Print all 3 arrays according to the output in the description
        System.out.println(cities[0] + "'s population is " + pop[0] + ".");
        System.out.println(cities[1] + "'s population is " + pop[1] + ".");
        System.out.println(cities[2] + "'s population is " + pop[2] + ".");
        System.out.println("");
        System.out.println("The least amount of sunshine " + cities[0] + " gets is " + sunshine[0] + " hours a day.");
        System.out.println("The least amount of sunshine " + cities[1] + " gets is " + sunshine[1] + " hours a day.");
        System.out.println("The least amount of sunshine " + cities[2] + " gets is " + sunshine[2] + " hours a day.");
    }
}
