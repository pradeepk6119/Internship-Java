class Circle
{
    double radius;
    final static double pi=3.14;
    Circle(double rad)
    {
        System.out.println("Creating a circle of radius "+rad);
        radius=rad;
    }
    void diameter(){
        double dia=2*radius;
        System.out.println("Diameter of circle is "+dia);
    }
    void area(){
        double a=pi*radius*radius;
        System.out.println("Area of circle is "+a);
    }
    void circumference(){
        double c=2*pi*radius;
        System.out.println("Circumference of circle is "+c);
    }
}
class Program16
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Circle c1=new Circle(1.2);
        c1.daimeter();
        c1.area();
        c1.circumference();

        Circle c2=new Circle(2.2);
        c2.daimeter();
        c2.area();
        c2.circumference();

        System.out.println("main method ended");
    }
}