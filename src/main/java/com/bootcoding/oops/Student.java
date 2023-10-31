package com.bootcoding.oops;


public class Student {
    // Properties
    // Data Members

    int rollNo; // default
   private String name; // pri
   public   double percentage;
  protected  String emailId;
    long phone;
    String address;



    public static void main(String[] args) {

        int a = 10;

        a = 20;
        Student std = new Student();
        // std - Reference Variable
//        std.rollNo = 101;
        std.name = "ARUN";

        // NULL - Nothing - Undefined

        std.printMyDetails();
        Student s2 = null;
        System.out.println(s2);

        // call method
//        obj.method();

//        std.printMyDetails();
    }

    private void printMyDetails(){
        System.out.println("roll No " + rollNo);
        System.out.println(" Email Id " + emailId);
    }
    // Methods
    // Member Methods
}
