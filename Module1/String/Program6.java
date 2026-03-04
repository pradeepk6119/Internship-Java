//contains(), startsWith(), endsWith()
class Program6
{
    public static void main(String[] args)
    {
        String str="Engineering";
        System.out.println(str.contains('job'));
        System.out.println(str.contains('gin'));

        System.out.println(str.startsWith('eng'));
        System.out.println(str.startsWith('Engine'));

        System.out.println(str.contains('ing'));
        System.out.println(str.contains('ring'));

       
    }
}
