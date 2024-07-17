import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double startLat = scanner.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        double startLong = scanner.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        double endLat = scanner.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        double endLong = scanner.nextDouble();
        GeoLocation startLocation = new GeoLocation(startLat, startLong);
        GeoLocation endLocation = new GeoLocation(endLat, endLong);
        System.out.print("The distance is " + startLocation.distanceFrom(endLocation) + " miles.");
        
    }
}
