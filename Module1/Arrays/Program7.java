//Array Sum
class Program7
{
    public static void main(String[] args)
    {
        int arr[]={12,10,13,14,15};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Array Sum : "+sum);
    }
}