public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] arrayOne = new String[]{"Welcome", "to", "the snap shot", "app!"};
        System.out.println(arrayOne[0]);
        System.out.println(arrayOne[1]);
        System.out.println(arrayOne[2]);
        System.out.println(arrayOne[3]);
        System.out.println("");
        arrayOne[0] = "Upgrade";
        arrayOne[3] = "premium app!";
        System.out.println(arrayOne[0]);
        System.out.println(arrayOne[1]);
        System.out.println(arrayOne[2]);
        System.out.println(arrayOne[3]);
    }
}
