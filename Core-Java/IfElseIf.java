package com.Telusko.CoreJava;

public class IfElseIf {
    public static void main(String args[]){
        // Greatest of 3 numbers
        int a = 50;
        int b = 6;
        int c = 300;
        if(a>b && a>c)
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
