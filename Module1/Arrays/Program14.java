class Program14
{
    static void display(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {14, 12, 15, 18, 16};
        System.out.println("Before sorting");
        display(arr);
        java.util.Arrays.sort(arr);
        System.out.println("After sorting");
        display(arr);
    }
}