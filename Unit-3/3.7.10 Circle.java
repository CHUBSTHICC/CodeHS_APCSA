public class Circle
{
    private int radius;
    private String color;
    private int x;
    private int y;
    
    public Circle(int theRadius, String theColor, int xPosition, int yPosition)
    {
        radius = theRadius;
        color = theColor;
        x = xPosition;
        y = yPosition;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public String getColor()
    {
        return color;
    }
    
    // Implement a toString method and an equals method here!
    public String toString()
    {
        // Change this!
        return color + " circle with a radius of " + radius + " at position (" + x + ", " + y + ")";
    }
    
    public boolean equals(Circle other)
    {
        // Change this!
        boolean equals = false;
        if (this.color.equals(other.color))
        {
            if (this.radius == other.radius)
            {
                if (this.x == other.x)
                {
                    if (this.y == other.y)
                    {
                        equals = true;
                        return equals;
                    }
                }
            }
        }
        else
        {
            equals = false;
            return equals;
        }
        return equals;
        
        
    }
}
