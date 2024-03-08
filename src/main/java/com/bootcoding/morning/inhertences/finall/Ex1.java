package com.bootcoding.morning.inhertences.finall;

public class Ex1 {
    public static void main(String[] args) {
        B b1=new B();
    }
}

//We can't inherit the final class
 /*final*/ class A{
     //Final method can't be overriden
    /*final*/void show(){
        System.out.println("I am in A");
    }
}
class B extends A{
    void show(){
        System.out.println("I am in B");
    }
}
