package com.company;


import java.util.Scanner;

public class Num19 {

    public static int des(int n){
        if (n < 10) return n;
    else return (des(n / 10));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.printf("%d - %d", num, des(num));
    }
}
