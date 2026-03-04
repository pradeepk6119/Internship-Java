import java.util.Scanner;
class Program6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character Value ");
        char ch = sc.next().charAt(0);// We are reading the first character of the input string
        System.out.println("Value : " + ch);
    }
}