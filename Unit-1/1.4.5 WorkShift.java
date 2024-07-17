public class WorkShift
{
    public static void main(String[] args)
    {
        double hours = 20;
        double newHours = 0;
        double mins = 42;
        double newMins = 0;
        double firstSeconds = 16;
        double total = 0;
        
        newMins = hours * 60;
        newMins = newMins + mins;
        total += newMins * 60 + firstSeconds;
        System.out.println(total);
        System.out.print("The total amount of seconds is ");
        System.out.print(total);
        System.out.print(" .");
        
    }
}
