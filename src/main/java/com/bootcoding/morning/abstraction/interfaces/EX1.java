package com.bootcoding.morning.abstraction.interfaces;

public class EX1 {
    public static void main(String[] args) {
        A a1;
        B b1= new B();
        b1.show();
        a1= b1;
        a1.show();
    }
}
interface A{
    void show();
}
class B implements A{
    @Override
     public void show(){
         System.out.println("I am in B");
    }

}