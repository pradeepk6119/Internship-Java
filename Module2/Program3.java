//Represent Employee as object
//id,name,salary,age
//4.Represent BankAccount as object
//accnum, accbal, ifsc code
//5.Represent Product as object
//id, desc, price, brand
//6.Represent File as object
//filename, filesize, filetype, filelocation, fileextension
//7.Represent 2DGraphPoint as object
//xaxis and yaxis
//8.Represent GPSLocation as object
//latitude, longitude, direction, altitude
//9.Represent chat as a object
// content, ..
//10.Represent email as a object

class Employee
{
    String name;
    String designation;
    int salary;
}
class Program3
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Employee p1 =new Employee();
        p1.name="Sundar";
        p1.designation="Software developer";
        p1.salary=250000;
     
        System.out.println("Employee.Name: "+p1.name);
        System.out.println("Employee.Designaton: "+p1.designation);
        System.out.println("Employee.Salary: "+p1.salary);
       
        System.out.println("main method ended");

    }
}