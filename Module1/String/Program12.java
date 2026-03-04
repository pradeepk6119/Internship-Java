//reversing the string
class Program12
{
    public static void main(String[] args)
    {
      String str="Tiger";
      String rev="";

      for(int i=str.length()-1;i>=0;i--)
      {
        rev=rev+str.charAt(i);
      }
        System.out.print(rev);
    }
}
