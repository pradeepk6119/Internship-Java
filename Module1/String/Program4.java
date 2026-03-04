//indexOf()
class Program4
{
    public static void main(String[] args)
    {
        String str="Karnataka";
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf('r'));
        System.out.println(str.indexOf('h'));

        int p = str.indexOf('a');
        int q = str.indexOf('a',p+1);
        int r = str.indexOf('a',q+1);
        int s = str.indexOf('a',r+1);

        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
    }
}
