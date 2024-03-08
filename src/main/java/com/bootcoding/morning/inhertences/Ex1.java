package com.bootcoding.morning.inhertences;

public class Ex1 {
    public static void main(String[] args) {
        B b1=new B();
       b1.setB(10);
       b1.showB();
       b1.showA();

    }
}

class A{//parent
     int n;
    void setA(int n){
        this.n=n;
    }
    void showA(){
        System.out.println("From A - "+n);
    }
}

class B extends A{
    private int n;
    void setB(int n){
        super.n=n;
    }
    void showB(){
        System.out.println("From B - "+n);
    }

}
