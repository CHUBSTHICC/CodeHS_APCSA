public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double cel = Math.random();
        double cel2 = Math.random();
        
        // Create two Racecar objects
        Racecar car = new Racecar(cel, "Jerry Berry");
        Racecar car2 = new Racecar(cel2, "Foople Doople");
        
        // Compute the finishing times for both cars
        double time1 = car.computeTime(2414);
        double time2 = car2.computeTime(2414);
        
        // Print times of each car
        System.out.println("First car finished in " + time1 + " seconds");
        System.out.println("Second car finished in " + time2 + " seconds");
        
    }
}
