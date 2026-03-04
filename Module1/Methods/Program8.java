class Program8
{
    static void run(boolean bool)
    {
        System.out.println("Passed Value : "+bool);
    }
    static void help(char ch)
    {
        System.out.println("Value Passed : "+ch);
        run(true);
    }
    public static void main(String[] args)
    {
        help('J');
    }
}