class Program13
{
    static boolean push()
    {
          return true;
    }
    static char help()
    {
        return 'A';
    }
    public static void main(String[] args)
    {
        char ch=help();
        System.out.println("Returned value : "+ch);
        System.out.println("Value Returned : "+push());
    }
}