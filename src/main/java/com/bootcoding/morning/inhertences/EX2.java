package com.bootcoding.morning.inhertences;

import java.sql.SQLOutput;

//Super Constructor
public class EX2 {
    public static void main(String[] args) {
        R r1= new R();
    }
    }

class P{
    P(){
        System.out.println("Default constructor form P");
    }

    P(int n){
        System.out.println("Parameterized Contrc. from P");
    }
}
 class Q extends P{
    Q(){
        System.out.println("Default cons. from Q");
    }
    Q(int n){
        super(200);
        System.out.println("Parameterized from Q");
    }
}
class R extends Q{
    R(){
        System.out.println("Default from R");
    }
    R(int n){
        System.out.println("Parameterizsed from R");
    }
}
