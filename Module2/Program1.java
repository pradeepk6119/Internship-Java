class Pen
{
    //attributes
    String brand;
    String color;
    double price;
}
class Program1
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        {
        Pen p1 =new Pen();
        p1.brand="Cello";
        p1.color="Black";
        p1.price=25.00;
        System.out.println("Pen.Brand: "+p1.brand);
        System.out.println("Pen.Color: "+p1.color);
        System.out.println("Pen.Price: "+p1.price);

        Pen p2 =new Pen();
        p2.brand="Reynolds";
        p2.color="Blue";
        p2.price=30.00;
        System.out.println("Pen.Brand: "+p2.brand);
        System.out.println("Pen.Color: "+p2.color);
        System.out.println("Pen.Price: "+p2.price);

        System.out.println("main method started");
    }
}
}

