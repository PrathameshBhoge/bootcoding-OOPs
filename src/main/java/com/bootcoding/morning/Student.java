package com.bootcoding.morning;

public class Student {
    String name;
    int age;
    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;

    }
//    Student(){
//        System.out.println("Hey their");
//
//    }
    public static void main(String[] args) {
        Student s1=new Student("Bootccoding",1);
//        s1.name="Anisha";
//        s1.age=20;
        s1.print();

    }
}
