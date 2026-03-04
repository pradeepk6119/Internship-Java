//lastIndexOf()
class Program5
{
    public static void main(String[] args)
    {
        String str="Developer";
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('v'));
        System.out.println(str.indexOf('M'));

        int a = str.lastIndexOf('e');
        int b = str.lastIndexOf('e',a-1);
        int c = str.lastIndexOf('e',b-1);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
