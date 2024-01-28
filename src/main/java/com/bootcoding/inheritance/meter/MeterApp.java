package com.bootcoding.inheritance.meter;

public class MeterApp {
    public static void main(String[] args) {
        threephasemeter tp=new threephasemeter();
        tp.material="Fiber";
        tp.type="Residential";
        tp.Volts="60 volts";
        tp.reading=100.90;
        tp.price=4000.00;
        tp.buildMeter();
        tp.Display();

        tp.buildMeter();
        System.out.println("Material : "+tp.material);
        System.out.println("Type : "+tp.type);
        System.out.println("Volts : "+tp.Volts);
        System.out.println("Price : "+tp.price);
        tp.Display();

    }
}
