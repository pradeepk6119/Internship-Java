class Student 
{
    String name;
    String qualification;
    int yop;
    String emailId;
    Student(String n, String q, int y)
    {
        name=n;
        qualification=q;
        yop=y;
    }
    Student(String n, String q , int y, String e)
    {
        name=n;
        qualification=q;
        yop=y;
        emailId=e;
    }
}
public class Program4
{
    public static void main(String[] args)
    {
        Student s1=new Student("raj","MCA",2026);
        System.out.println(s1.name + " " + s1.qualification + " " + s1.yop + " " + s1.emailId);
        Student s2=new Student("pradeep","BE",2026,"pradeep123@gmail.com");
        System.out.println(s1.name + " " + s2.qualification + " " + s2.yop + " " + s2.emailId);
    }
}