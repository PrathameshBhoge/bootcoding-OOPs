package com.bootcoding.morning.abstraction.abtsract;

public class Ex1 {
    public static void main(String[] args) {
       // A a1= new A();
        A a1;
        B b1=new B();
        b1.showA();
    }
}


// We can't create the object object of Abstract class but we can declare the object of abstract class
abstract class A{
    void showA(){
        System.out.println("I am in A");
    }
}
//if we want to call the method present in abstract class we have to create another class and the inherit them
//  then call the mmethod of abstract class by using the object of child class
 class B extends A{
}