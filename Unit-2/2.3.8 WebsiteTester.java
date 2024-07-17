public class WebsiteTester
{
    public static void main(String[] args)
    {
        Website hi = new Website();
        System.out.println(hi);
        Website hello = new Website("goodSchool", "edu");
        System.out.println(hello);
        Website yellow = new Website("codehs", "com", 1000000);
        System.out.print(yellow);
    }
}
