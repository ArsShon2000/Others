package com.company;

import java.util.Scanner;

public class Num4 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n, i, a[];
        System.out.print(("Введите длину массива n -> "));
        n = in.nextInt();
        a = new int[n];
        int frst = Integer.MIN_VALUE;
        int scnd = Integer.MIN_VALUE;
        for (i = 0; i < n; i++) {
            System.out.print(("Введите a[" + i + "] -> "));
            a[i] = in.nextInt();
        }
        int rep = 0;
        while (rep == 0) {
            for (i = 0; i < n; i++) {
                if (i == 0) {
                    frst = a[i];
                    scnd = a[i + 1];
                    a[i + 1] = frst;
                    frst = scnd;
                    a[0] = a[n - 1];
                } else if (i < n - 1) {
                    frst = scnd;
                    scnd = a[i + 1];
                    a[i + 1] = frst;
                    frst = scnd;
                }
                System.out.println("a[" + i + "] - " + a[i]);
            }
            rep = in.nextInt();
        }
    }
}
