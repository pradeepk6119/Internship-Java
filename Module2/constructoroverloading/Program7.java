class Demo5
{
    //instance variable
    int x=100;
    void display(){
        int x=200;
        //local variable
        System.out.println("instance variable x value is"+this.x);
        System.out.println("local variable x value is"+x);
    }
}
class Program7
{
    public static void main(String[] args)
    {
        System.out.println("main method started");

        Demo5 d1 =new Demo5();
        d1.display();
        
        System.out.println("main method ended");
    }
}