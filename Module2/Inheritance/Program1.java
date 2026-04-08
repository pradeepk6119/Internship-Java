//package com.jspiders.inheritance;
class Demo{
    int x=100;
    void test(){
        System.out.println("Executing test()......");
    }
}
class Sample extends Demo{

}
public class Program1{
    public static void main(String[] args){
        Sample ref=new Sample();
        System.out.println(ref.x);
        ref.test();
    }
}