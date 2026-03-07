class Demo3
{
    //attributes or states or fields or data members or instance variables.
    int x;
    double y;
    Demo3()
    {
        System.out.println("Running Demo3 class Constructor");
        x=10;
        y=3.5;
    }
}
class Program14
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Demo3 d1=new Demo3();

        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y);

        System.out.println("main method ended");
    }
}