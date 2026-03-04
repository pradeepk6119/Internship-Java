class Program11
{
    public static void main(String[] args) 
    {
        int arr[] = {14, 12, 17, 16, 19, 15};
        int small = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < small)
            {
                small = arr[i];
            }
        }
        System.out.println("Smallest array is: " + small);
    }
}
