public class PizzaTester 
{
    public static void main(String[] args)
    {
        Pizza myPizza = new Pizza ("Veggie", "Pepperoni, Cheese, Pineapples", 8);
        System.out.println(myPizza);
        
        Pizza myPizzaTwo = new Pizza ("Veggier", "Pepperoni, Spinnach, Pineapples", 9);
        System.out.println(myPizzaTwo);
        
        Pizza myPizzaThree = new Pizza ("Veggier", "Pepperoni, Spinnach, Pineapples", 9);
        System.out.println(myPizzaThree);
    }
}
