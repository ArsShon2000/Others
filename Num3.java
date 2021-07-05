package com.company;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n, i, a[];
        System.out.println(("Введите длину массива n -> "));
        n = in.nextInt();
        a = new int[n];
        int back = Integer.MIN_VALUE;
        int vper = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            System.out.println(("Введите a[" + i + "] -> "));
            a[i] = in.nextInt();
        }
        for (i = 0; i < a.length / 2; i++) {
            if (a.length % 2 == 0) {
                back = a[a.length / 2 - 1 - i];
                System.out.println("a[" + (a.length / 2 - 1 - i) + "] = " + back);
                vper = a[a.length / 2 + i];
                System.out.println("a[" + (a.length / 2 + i) + "] = " + vper);
                if (back != vper){ System.out.println("NO"); break;}
            }
            else{
                back = a[a.length / 2 - 1 - i];
                System.out.println("a[" + (a.length / 2 - 1 - i) + "] = " + back);
                vper = a[a.length / 2 + 1 + i];
                System.out.println("a[" + (a.length / 2 + i) + "] = " + vper);
                if (back != vper) { System.out.println("NO"); break;}
            }
            System.out.println("YES");
        }
    }
}
