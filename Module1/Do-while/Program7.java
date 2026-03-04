class Program7
{
    public static void main(String[] args)
    {
        int num=13;
        int a=1;
        int count=0;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                count++;
            }
            a++;
        }
        if(count==1)
        {
            System.out.println(num+" is a prime number");
        }
        else
        {
            System.out.println(num+" is not a prime number");
        }
    }
}