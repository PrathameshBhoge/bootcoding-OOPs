package com.bootcoding.morning.encapsulation;

public class A {
    private int value;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
class B {
    public static void main(String[] args) {
        A a= new A();
        a.setValue(100);
        a.getValue();
        System.out.println(a.getValue());
    }
}
