package com.company;
import java.util.Scanner;
    public class Num6 {
        //    Напишите программу, вводящую последовательность целых чисел,
//    и печатающую максимальное число идущих подряд одинаковых элементов/
        public static void main(String[] args) {
            // write your code here
            Scanner in = new Scanner(System.in );
            int a = 1;
            int max = 1, f = 1, kol = 1;
            while (true) {
                if (a == f || a == f+1) {
                    System.out.print("введите число - ");
                    a = in.nextInt();
                }
                else
                    break;

                if (a == f) {
                    kol++;
                    if (kol > max)
                        max = kol;
                }
                else {
                    kol = 1;
                    f++;
                }



            }
            System.out.println("максимальное число " + max);

        }
    }

