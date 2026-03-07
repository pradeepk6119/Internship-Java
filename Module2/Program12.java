class Demo2
{
    Demo2()
    {
        System.out.println("Running Demo2 class Constructor ");
    }
    {
        System.out.println("Running first non-static block of class body ");
    }
    {
        System.out.println("Running second non-static block of class body ");
    }
}
class Program12
{
    public static void main(String[] args) 
    {
        System.out.println("main method started");

        new Demo2();

        System.out.println("main method ended");
    }
}