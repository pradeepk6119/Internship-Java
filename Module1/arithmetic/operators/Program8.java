class Program8
{
public static void main(String[] args)
{
double principle=100000.0;
int tenure=2;
double rate=11.5;
double simpleInterst=(principle*tenure*rate/100);
double totalRepayment=(principle+simpleInterst);
double emi=(totalRepayment/(tenure*12));
System.out.println("Simple Interest : "+simpleInterst);
System.out.println("Total Repayment : "+totalRepayment);
System.out.println("EMI : "+emi);
}
}
