class Employee
{
    String name;
    String company;
    int salary;
    Employee(String n,String c,int s)
    {
        name=n;
        company=c;
        salary=s;
    }
}
public class Program1
{
    public static void main(String[] args)
    {
        Employee e1=new Employee("Raj","Tcs",28000);
        System.out.println(e1.name+" "+e1.salary+" "+e1.company);
        Employee e2=new Employee("Rohit","Wipro",32000);
        System.out.println(e2.name+" "+e2.salary+" "+e2.company);
    }
}