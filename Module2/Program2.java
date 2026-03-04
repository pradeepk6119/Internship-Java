class Laptop
{
    String brand;
    String color;
    double price;
    int ram;
}
class Program2
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Laptop p1 =new Laptop();
        p1.brand="hp";
        p1.color="Black";
        p1.price=250000;
        p1.ram=8;
        System.out.println("Laptop.Brand: "+p1.brand);
        System.out.println("Laptop.Color: "+p1.color);
        System.out.println("Laptop.Price: "+p1.price);
        System.out.println("Laptop.Ram: "+p1.ram);

        System.out.println("main method ended");

    }
}