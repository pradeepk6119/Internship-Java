class Program16
{
    static int square(int n)
    {
        int sq=n*n;
        return sq;
    }
    public static void main(String[] args)
    {
        for(int a=1;a<=10;a++)
        {
            System.out.println(a+" Square : "+square(a));
        }
    }
}