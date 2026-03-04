import java.util.Scanner;
class Program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        double num1 = sc.nextDouble();
        System.out.println("Enter 2nd Number");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        System.out.println("Result : " + sum);
    }
}