class Bike
{
    String name;
    int price;
    Bike(String n,int p)
    {
        name=n;
        price=p;
    }
    
    public class Program2
    {
    public static void main(String[] args)
    {
        Bike b1=new Bike("Duke",285000);
        System.out.println(b1.name+" "+b1.price);
        Bike b2=new Bike("R15",245000);
        System.out.println(b2.name+" "+b2.price);
    }
}
}