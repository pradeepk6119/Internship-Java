public class Pizza
{
    final.String type="Regular";
    int price=150;
    boolean cheese;
    String toping;
    //Pizza with no Extra-toping,cheese optional
    Pizza(boolean c)
    {
        cheese=c;
        if(cheese==true)
        {
            price=price+40;
        }
    }
    //Pizza0 with one Extra toping,cheese optional
    Pizza(boolean c,String t)
    {
        cheese=c;
        toping=t;
        price=price+30;
        if(cheese==true)
        {
            price=price+40;
        }
    }
    //Pizza with two-Extra toping,50rs

}
public class Program5
{
    public static void main(String[] args)
    {
        Pizza p1=new Pizza(true);
        System.out.println(p1.price);
        Pizza p2=new Pizza(true ,"Mushroom");
        System.out.println(p2.price);
    }
}