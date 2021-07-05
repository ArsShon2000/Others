package com.company;

import java.util.Scanner;

public class Num8 {
    public static void main(String[] args)throws Exception {
        Scanner in = new Scanner(System.in);
        int k = 0, a = 0;
        while (true){
            int str = in.nextInt();
            if (str == 1 && a == 0) {
                k++;
            }
            System.out.println(k + "-я группа");
            a = str;
            if (str != 0 && str != 1){
                break;
            }
        }
    }
}
