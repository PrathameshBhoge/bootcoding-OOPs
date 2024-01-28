package com.bootcoding.morning.exceptionhandling;

public class NullPointerExceptions {
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println(str.toUpperCase());
        }
        catch(NullPointerException e){
            System.out.println(e);
        }

        System.out.println("The end ");
    }
}
