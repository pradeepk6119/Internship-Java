//split()
class Program11
{
    public static void main(String[] args)
    {
      String str="Qspiders Jspiders Pyspiders Prospiders";
      String arr[]=str.split(" ");

      for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]);
      }
    }
}
