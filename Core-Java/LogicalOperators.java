package com.Telusko.CoreJava;

public class LogicalOperators {
    public static void main(String args[]){
        int x = 10;
        int y = 20;

        int a = 4;
        int b = 8;
//        short ciruit condition for && logical AND both true then true else false
//        boolean result = (x<y) && (++a>b);
//        short ciruit condition for || logical OR Anyone one of them true then true else false;
        boolean tempResult = (x<y) || (a++>b++);
        System.out.println(a+" "+tempResult);

    }
}
