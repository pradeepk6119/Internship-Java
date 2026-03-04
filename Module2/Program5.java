//5.Represent Product as object
//id, desc, price, brand
class Product
{
    int id;
    String desc;
    double price;
    String brand;
}
class Program5
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        
        Product p1 = new Product();
        p1.id=12345;
        p1.desc="Mobile phone";
        p1.price=25000;
        p1.brand="Redmi";

        System.out.println("Product.Id: "+p1.id);
        System.out.println("Product.Desc: "+p1.desc);
        System.out.println("Product.Price: "+p1.price);
        System.out.println("Product.Brand: "+p1.brand);

        System.out.println("main method ended");
    }
}