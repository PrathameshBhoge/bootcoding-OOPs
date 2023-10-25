package com.bootcoding.morning.polymorphism;

public class EX2 {
    public static void main(String[] args) {
//      Shape s= new Shape();
//      s.show();
        Square square= new Square();
        square.show();
    }
}
class Shape{
    void show(){
        System.out.println("I don't have any shape");
    }
}
class Square extends Shape{
    @Override
    void show(){
        super.show();
        System.out.println("I am square ");
    }
}