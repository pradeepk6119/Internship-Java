class Program12
{
public static void main(String[] args)
{
char ch='T';
if(ch>='A' && ch<='Z')
{
	System.out.println("uppercase");
}
else if(ch>='a' && ch<='z')
{
	System.out.println("lowercase");
}
else if(ch>='0' && ch<='9')
{
	System.out.println("Number");
}
else
{
System.out.println("Special Character");
}
}
}