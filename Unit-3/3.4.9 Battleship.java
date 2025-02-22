public class Battleship
{
    private String name;  // type of ship
    private int power;   // power of attack in range [1 - 10]
    private int health; // health of the ship
    
    // Constructor
    public Battleship(String shipType, int attackPower)
    {
        name = shipType;
        power = attackPower;
        health = 100;
    }
    
    // Modifies the health of the battleship
    public void updateDamage(int attackPower)
    {
        power = attackPower;
        if (attackPower < 5)
        {
            health = health - 2;
        }
        else if (attackPower < 10)
        {
            health = health - 7;
        }
        else if (attackPower >= 10)
        {
            health = health - 10;
        }

    }
    
    // Returns true if the health of
    // the ship is greater than 0
    public boolean stillFloating()
    {
        boolean stillFloating = true;
        if (health > 0)
        {
            stillFloating = true;
        }
        else
        {
            stillFloating = false;
        }
        return stillFloating;
    }
    
    // Returns the power of the ship
    public int getPower()
    {
        return power;
    }
    
    // Returns string representation in the form
    // Battleship name
    public String toString()
    {
        return name + "(" + health + ")";    
    }
    
}
