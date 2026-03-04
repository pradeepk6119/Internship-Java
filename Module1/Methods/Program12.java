class Program12
{
    static double play()
    {
          return 4.5;
    }
    public static void main(String[] args)
    {
        double d=play();
        System.out.println("Returned value : "+d);

        System.out.println("Returned value : "+play());
    }
}