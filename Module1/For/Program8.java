class Program8
{
public static void main(String[] args)
{
int n=5;
char val='a';
for(int i=0;i<n;i++)
{
	if(i%2==0)
	{
		System.out.print(val+"");
		val++;
	}
	else
	{
		System.out.print("*"+"");
	}
}
}
}