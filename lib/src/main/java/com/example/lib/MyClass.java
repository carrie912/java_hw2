package com.example.lib;

import java.util.Scanner;

public class MyClass {
    public static void main ( String[] args ) {
        int a , b , c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入XXXX年");
        a =scanner.nextInt();
        System.out.println("請輸入XX月");
        b =scanner.nextInt();
        System.out.println("請輸入XX 日");
        c =scanner.nextInt();
        System.out.println("出生於"+a+"年"+b+"月" + c+"日" );

    }
}
