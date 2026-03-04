class Program11
{
public static void main(String[] args)
{
int age=25;
if(age<=3)
{
	System.out.println("Free");
}
else if(age>3 && age<=10)
{
	System.out.println("Half Ticket");
}
else if(age>10 && age<60)
{
	System.out.println("Full Ticket");
}
else
{
System.out.println("Sr Citizen Ticket");
}
}
}