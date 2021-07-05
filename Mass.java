package com.company;

import java.util.Scanner;

public class Mass {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
//        int [] a1 = {20, 10, 30};
////        System.out.println(a1.length);
//        a1[1] = 1000;
////        System.out.println(a1 [0]);
//
//        int [] b = a1.clone();
////        System.out.println();
//
//        String [] a = new String[3];
////        System.out.println(1);
//
//
//        for(int i = 0; i < a1.length; i++){
////            System.out.println(a1 [i]);
//        }


//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        in.close();
//        int [] a3 = new int[n];
//        int max = a3[0], kol = 0;
//        System.out.println(a3[0]+ " = a3[0] ");
//        for(int i = 0; i < a3.length; i++){
//            a3[i] = (int)(Math.random()*10) + 20;
//            System.out.println(a3[i]);
//            if (max == a3[i]){
//                kol ++;
//            }
//            if (max < a3[i]) {
//                max = a3[i];
//                kol = 1;
//            }
////            if (max < a3[i])
////                kol = 0;
////            else
////                kol ++;
////        }
////        for(int i = 0; i < a3.length; i++){
////            if (u == a3[i])
////                y ++;
////
////        }
//
//        System.out.println(max + "max");
//        System.out.println(kol + "kol");
//
//
//
//        int [][] a = new int[3][3];
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//
//        for (int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length; j++){
//                a[i][j] = (int)(Math.random()*0) + 0;
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.print("\n");
//        }
//        System.out.println();
//        for(int j = 0; j < a.length; j++){
//            for(int i = 0; i < a[j].length; i++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.print("\n");
//        }

//        int n = in.nextInt();
//        int [][] a = new int[n][n];
//        System.out.println(a.length);
//        System.out.println(a[0].length);
//
//        for (int i = 0; i < a.length; i++){
//            for(int j = 0; j < a[i].length; j++){
//                if (i > 0 && j > 0 && i < n-1 && j < n - 1)
//                    a[i][j] = 1;
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.print("\n");
//        }

//
        int N = 5;
        int a[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            a[i][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)

                System.out.printf("%3d",a[i][j]);
            System.out.println();
        }



    }
}
