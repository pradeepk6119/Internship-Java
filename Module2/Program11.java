class Demo1
{
    Demo1()
    {
        System.out.println("Running Demo1 class Constructor ");
    }
}
class Program11
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        new Demo1();
        new Demo1();

        System.out.println("main method ended");
    }
}
