package com.bootcoding.morning.polymorphism;

import javax.management.ImmutableDescriptor;

public class EX1 {
    public static void main(String[] args) {
        Magic m = new Magic();
        VI vi= new VI();
        m.print(vi);
        Airtel airtel= new Airtel();
        m.print(airtel);
        Jio jio=new Jio();
        m.print(jio);
    }
}

 class Sim{
     void intialize(){
         System.out.println("I am sim ");

     }
}

class Airtel extends Sim{
    @Override
    void intialize() {
        System.out.println("Airtel Sim intialize");
    }
}
class VI extends Sim{
    @Override
    void intialize() {
        System.out.println("VI Sim initialize");
    }
}
class Jio extends Sim{
    @Override
    void intialize() {
        System.out.println("Jio sim initialize");
    }
}

class Magic {
    public void print(Sim sim){
        System.out.println("Start");
       sim.intialize();
        System.out.println("End");
    }
}