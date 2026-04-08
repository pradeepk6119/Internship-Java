class Pen 
{
    // Instance variables
    String brand;
    String color;
    double price;
    
    // Constructor
    Pen(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    
    // Method to display pen details
    void details(){
        // FIX: Added the missing + sign right before the word 'price' at the end
        System.out.println("Brand:" + brand + ",Color:" + color + ",Price:" + price);
    }
}

public class Program8
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        // Passing actual values (String, String, double) instead of variable names
        Pen p1 = new Pen("Parker", "Blue", 150.50);
        
        // Calling the details() method to print p1's info
        p1.details(); 
        
        Pen p2 = new Pen("Cello", "Black", 20.00);
        p2.details();

        System.out.println("main method ended");
    }
}