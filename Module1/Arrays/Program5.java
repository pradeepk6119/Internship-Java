//even no.s and odd no.s from the array
class Program5
{
    public static void main(String[] args)
    {
        int[] arr={15,12,14,13,17,16};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.println(arr[i]);
            }
        }
    }
}