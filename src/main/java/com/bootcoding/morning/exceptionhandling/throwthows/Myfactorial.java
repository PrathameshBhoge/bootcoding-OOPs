package com.bootcoding.morning.exceptionhandling.throwthows;
class Myexception extends Exception{
    public String toString(){
        return "can not calculate the factorial of -ve number ";
    }
}
public class Myfactorial {
    public static void main(String[] args) {
        try{
            System.out.println(fact(5));
            System.out.println(fact(-5));
        }catch(Myexception e){
            System.out.println(e);
        }
    }

    public  static int  fact(int n) throws Myexception{
        int f=1;
        if(n<=0){
            throw new Myexception();
        }
        else{
            for(int i=1;i<=n;i++){
                f=f*i;
            }
        }
        return f;
    }
}
