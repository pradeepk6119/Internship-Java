// Removed 'public' so this can compile in the same file as Program5.java
class Pizza 
{
    // FIX: Replaced 'final.String' with 'final String'
    final String type = "Regular";
    int price = 150;     // Base price of every pizza
    boolean cheese;      // Tracks if extra cheese is added
    String topping1;     // Tracks the first extra topping
    String topping2;     // Tracks the second extra topping (if applicable)

    // CONSTRUCTOR 1: Pizza with NO extra toppings, cheese is optional
    Pizza(boolean c)
    {
        cheese = c;
        if(cheese == true) 
        {
            price = price + 40; // Extra cheese costs 40rs
        }
    }

    // CONSTRUCTOR 2: Pizza with ONE extra topping, cheese is optional
    Pizza(boolean c, String t1)
    {
        cheese = c;
        topping1 = t1;
        price = price + 30; // One extra topping costs 30rs
        
        if(cheese == true)
        {
            price = price + 40; // Extra cheese costs 40rs
        }
    }

    // CONSTRUCTOR 3: Pizza with TWO extra toppings, cheese is optional
    Pizza(boolean c, String t1, String t2)
    {
        cheese = c;
        topping1 = t1;
        topping2 = t2;
        price = price + 50; // Two extra toppings cost a combined 50rs
        
        if(cheese == true)
        {
            price = price + 40; // Extra cheese costs 40rs
        }
    }
}

public class Program6
{
    public static void main(String[] args)
    {
        // Test Case 1: Just cheese (Base 150 + Cheese 40 = 190)
        Pizza p1 = new Pizza(true);
        System.out.println("Pizza 1 price (Cheese only): Rs. " + p1.price);
        
        // Test Case 2: Cheese + 1 Topping (Base 150 + Topping 30 + Cheese 40 = 220)
        Pizza p2 = new Pizza(true, "Mushroom");
        System.out.println("Pizza 2 price (Cheese + 1 Topping): Rs. " + p2.price);
        
        // Test Case 3: Cheese + 2 Toppings (Base 150 + 2 Toppings 50 + Cheese 40 = 240)
        // I added this test case so you can see your new constructor at work!
        Pizza p3 = new Pizza(true, "Mushroom", "Olives");
        System.out.println("Pizza 3 price (Cheese + 2 Toppings): Rs. " + p3.price);
    }
}