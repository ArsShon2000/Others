package com.company;

import java.util.Scanner;

public class urok {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        in.close();

        System.out.println("aaa");

        if ((x > y)) {  // ! это инвертиреует
            System.out.println("bbb");
        }
        if (x < y) {
            System.out.println("ccc");
        }

        System.out.println("ddd");
    }
}

