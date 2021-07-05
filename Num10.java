package com.company;

import java.util.Scanner;

public class Num10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите M: ");
        int M = in.nextInt();
        System.out.print("Введите N: ");
        int N = in.nextInt();

        int[][] A = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (int) (Math.random() * 10) + 10;
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(j % 2 == 1) System.out.print(A[M -1 - i][j] + " ");
                else System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
