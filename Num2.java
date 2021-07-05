package com.company;
import java.util.Scanner;
public class Num2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n, i, a[];
        System.out.println(("Введите длину массива n -> "));
        n = in.nextInt();
        a = new int[n];
        int max  = Integer.MIN_VALUE;
        int nMax = 0;
        for (i=0; i<n; i++) {
            System.out.println(("Введите a[" + i + "] -> "));
            a[i] = in.nextInt();
            if (a[i] > max) {
                max  = a[i];
                nMax = 1;
            } else if (a[i] == max)
                nMax += 1;
        }
       System.out.println("Количество макс. элементов = " + nMax);
    }

}