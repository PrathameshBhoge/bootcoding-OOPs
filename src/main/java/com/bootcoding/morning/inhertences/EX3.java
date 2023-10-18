package com.bootcoding.morning.inhertences;

public class EX3 {
    public static void main(String[] args) {
        N n1 = new N();
    }
}
class M{

}
class N extends M{
    N(){
        System.out.println("Default from N");
    }
}
