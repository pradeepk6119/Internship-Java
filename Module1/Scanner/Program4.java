import java.util.Scanner;
class Program4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mobile Number");
        long mobile = sc.nextLong();
        System.out.println("Enter CTC");
        double ctc = sc.nextDouble();
        System.out.println("Are You Single");
        boolean single = sc.nextBoolean();
    
        System.out.println("Mobile :" + mobile);
        System.out.println("CTC :" + ctc);
        System.out.println("Single :" + single);
    }
}