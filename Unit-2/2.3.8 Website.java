public class Website
{
    // Put your code here
    String domain;
    String topLevelDomain;
    int numUsers;
    
    public Website()
    {
        domain = "example";
        topLevelDomain = "com";
        numUsers = 0;
    }

    public Website(String theDomain, String theTopLevel)
    {
        domain = theDomain;
        topLevelDomain = theTopLevel;
        numUsers = 0;
    }
    
    public Website(String elDomain, String topLevelo, int ppl)
    {
        domain = elDomain;
        topLevelDomain = topLevelo;
        numUsers = ppl;
    }
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}
