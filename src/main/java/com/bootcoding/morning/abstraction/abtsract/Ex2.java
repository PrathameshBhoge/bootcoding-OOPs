package com.bootcoding.morning.abstraction.abtsract;

public class Ex2 {
    public static void main(String[] args) {
        Q q1=new Q();
        q1.print();
    }

}

//if i want to create a abstract method then the class is also declared abstract
abstract class P{
    //Abstract method does't have body it only have their prototype
    abstract void print();
}

/*If i want to call the abstract method present in abstract class then i have create a another class and then
inherit those class and override the method present in abstract class*/

class Q extends P{
    void print(){
        System.out.println("I am abstract method");
    }
}