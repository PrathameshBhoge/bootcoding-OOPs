package com.bootcoding.morning.exceptionhandling;

public class A {
    public static void main(String[] args) {
       try{
           int a=10,b=0,c;
           c=a+b;
            System.out.println("Value = "+ c);

       }catch (ArithmeticException e) {
           System.out.println(e);
       }catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e);
       }
        System.out.println("The end");
        int a= 10, b =5;
        System.out.println(a+b);
    }
}
