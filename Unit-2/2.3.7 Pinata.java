public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String theCandy, String theColor, String theShape)
    {
        candy = theCandy;
        color = theColor;
        shape = theShape;
    }
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String calor, String shapey)
    {
        color = calor;
        shape = shapey;
        candy = "hard candy";
    }
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String candie)
    {
        candy = candie;
        shape = "donkey";
        color = "rainbow";
    }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
