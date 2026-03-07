class Demo2
{
    static
    {
        System.out.println("Running static block of Demo2 class ");
    }
    Demo2()
    {
        System.out.println("Running Demo2 class Constructor ");
    }
    {
        System.out.println("Running first non-static block of Demo2 class ");
    }
    {
        System.out.println("Running second non-static block of Demo2 class ");
    }
}
class Program13
{
    static
        {
            System.out.println("Running static block of Program13 class ");
        }
        public static void main(String[] args)
    {
        System.out.println("main method started");

        new Demo2();
        new Demo2();

        System.out.println("main method ended");
    }
}