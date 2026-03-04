class Program16
{
public static void main(String[] args)
{
char gender='M';
int age=25;
if(gender=='M')
{
if(age>=21)
{
System.out.println("Eligible Bachelor");
}
else
{
System.out.println("Boy Underaged");
}
}
else if(gender=='F')
{
if(age>=19)
{
System.out.println("Eligible Spinster");
}
else
{
System.out.println("Girl Underaged");
}
}
else
{
System.out.println("Invalid Gender");
}
}
}