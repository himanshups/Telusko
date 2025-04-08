package com.Telusko.CoreJava;

public class Ternary {
    public static void main(String args[]){
        // Normal If Else flow:
        int number = 20;
        int result = 0;
//        if(number%2==0){
//            result = 10;
//        }
//        else{
//            result = 20;
//        }
//        ?: Ternary Operators:
        result = (number%2==0)?10:20;
        System.out.println(result);

    }
}
