class Demo4
{
    //attributes or instance variables
    int x;
    double y;
    //constructor with parameters
    Demo4(int arg1, double args2)
    {
        System.out.println("Instance variables are initialized from inside constructor with parameters" );
        x=arg1;
        y=args2;
    }
}
class Program15
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Demo4 d1=new Demo4(12, 4.5);

        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y);

        System.out.println("main method ended");
    }
}