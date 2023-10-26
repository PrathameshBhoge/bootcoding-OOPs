package com.bootcoding.morning.polymorphism;

public class EX3 {
    public static void main(String[] args) {
        A a= new A();

        a.add(30,40);
        System.out.println(a.add("Boot","coding"));
        System.out.println(   a.add());
    }

}

class A{
    int  add(){
      int a =10;
      int b = 20;
      int c= a+b;
     return c;
    }

    void add(int x,int y){
        int z=x+y;
        System.out.println(z);
    }

    String  add(String s,String p){
        String q= s+p;
        return q;
    }
}
