public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater companyOne = new Rater("Jerry's Burgers", 2.4);
        companyOne.updateReview();
        System.out.println(companyOne);
        companyOne.setRating(4.2);
        companyOne.updateReview();
        System.out.println(companyOne);
        companyOne.toString();
    }
}
