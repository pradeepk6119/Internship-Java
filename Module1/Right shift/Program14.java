class Program14
{
public static void main(String[] args)
{
double accBal=10000.0;
int amt=2000;
if(amt<=accBal)
{
	if(amt%100==0)
	{
		System.out.println("Withdrawal success");
	}
	else
	{
		System.out.println("Invalid Denomination");
	}
}
else
{
	System.out.println("Insufficient Balance");
}
}
}