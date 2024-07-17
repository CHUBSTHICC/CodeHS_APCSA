public class SalutationsTester
{
    public static void main(String[] args)
    {
        // Test your class here
        Salutations salut = new Salutations("Jersmy");
        System.out.println(salut);
        
        salut.addressLetter();
        salut.signLetter();
        salut.addressMemo();
        salut.signMemo();
    }
}
