class Program11
{
    static int test()
    {
          return 10;
    }
    public static void main(String[] args)
    {
        int val=test();
        System.out.println("Returned value : "+val);

        System.out.println("Returned value : "+test());
    }
}