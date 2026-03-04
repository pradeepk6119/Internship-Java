class BankAccount{
    int accnum;
    int accbal;
    String ifsccode;
}
class Program4
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        BankAccount b1 = new BankAccount();
        b1.accnum=123456789;
        b1.accbal=50000;
        b1.ifsccode="SBIN0001234";

        System.out.println("BankAccount.Accnum: "+b1.accnum);
        System.out.println("BankAccount.Accbal: "+b1.accbal);
        System.out.println("BankAccount.Ifsc code: "+b1.ifsccode);
        
        System.out.println("main method ended");
    }
}