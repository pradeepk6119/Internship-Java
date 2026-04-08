//package com.jspiders.inheritance;
class Alpha
{
    void play(){
        System.out.println("Executing play().....");
    }
}
class Beta extends Alpha{
    void disp(){
        System.out.println("Executing disp()......");
    }
}
public class Program2{
    public static void main(String[] args){
        Alpha obj=new Alpha();
        obj.play();
        //obj.disp();-->Super class not allowed to access sub-class properties
        Beta ref=new Beta();
        //Sub-class
        ref.play();
        ref.disp();
    }
}