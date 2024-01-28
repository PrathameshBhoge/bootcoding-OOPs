package com.bootcoding.morning.exceptionhandling;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
       try{
           for(int i=0;i<=arr.length;i++){
               System.out.println(arr[i]);
           }
       }catch(Throwable e){
           System.out.println(e);
       }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//If you are not able to found what exception is there then simply return their parent class
