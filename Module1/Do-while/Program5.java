class Program5
{
    public static void main(String[] args)
    {
        int num=25;
        int a=1;
        int sum=0;
        while(a<=num/2)
        {
            if(num%a==0)
            {
                sum=sum+a;
            }
            a++;
        }
        if(sum==num)
        {
            System.out.println(num+" is a perfect number");
        }
        else
        {
            System.out.println(num+" is not a perfect number");
        }
    }
}