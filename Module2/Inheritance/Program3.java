//package com.jspiders.inheritance;
class Delta{
    int a=10;
    private int b=20;
    static int c=30;
}
class Example extends Delta{

}
public class Program3{
    public static void main(String[] args){
        Example ref=new Example();
        System.out.println(ref.a);
        //System.out.println(ref.b);//private not inherited
        System.out.println(ref.c);//static not inherited but we can access
    }
}