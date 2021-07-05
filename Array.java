package com.company;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
//        Дано целое число N (> 0). Сформировать и вывести целочисленный
//        массив размера N, содержащий N первых положительных нечетных чисел:
//        1, 3, 5, ... .
//        int n = in.nextInt();
//        int [] a = new int[n];
//        for(int i = 0; n > i; i ++ ){
//            a [i] = (i * 2) + 1;
//            System.out.print(a [i] + ", ");
//        }


//        Дано целое число N (> 0). Сформировать и вывести целочисленный
//        массив размера N, содержащий степени двойки от первой до N-й: 2, 4, 8,
//                16, ... .
//        int n = in.nextInt();
//        int [] a = new int[n];
//        for(int i = 0; n > i; i ++ ){
//            a [i] = (int) Math.pow(2, i + 1);
//            System.out.print(a [i] + " ");
//        }


        int N = in.nextInt();
        int A = in.nextInt();
        int D = in.nextInt();
        int [] B = new int[N];
        for (int i =0; i < N; i++) {
            B[i] = A + D*i;
            System.out.print(B[i] + " ");
        }

    }
}
