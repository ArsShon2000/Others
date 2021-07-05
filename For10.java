package com.company;

import java.util.Scanner;
public class For10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        For1. Даны целые числа K и N (N > 0). Вывести N раз число K.

//        1ое задание
        try {
            int n = in.nextInt();
            for (int k = in.nextInt(); n > 0; n -= 1) {
                System.out.println(k);
            }
        }
        catch (Exception e){
            System.out.println("Введены некорректные данные. Ошибка " + e);
            System.out.println("Inconnect data entered. Error " + e);
        }

////        Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
////        целые числа, расположенные между A и B (включая сами числа A и B),
////        а также количество N этих чисел.
////        2ое задание
//
//        System.out.println("A должна быть меньше В");
//        System.out.print("А = ");
//        int A = in.nextInt( );
//        System.out.print("В = ");
//        int B = in.nextInt( );
//        int n = 0;
//        if (A > B){
//            System.out.println("ERROR!!!");
//        }
//        else
//            for(; A <= B; A += 1 ) {
//                n += 1;
//                System.out.println(A);
//            }
//        System.out.println("Цикл выполнялся " + n +" раз");

////        Даны два целых числа A и B (A < B). Вывести в порядке убывания все це-
////                лые числа, расположенные между A и B (не включая числа A и B), а также
////        количество N этих чисел.
////        3ое задание
//        System.out.println("A должна быть меньше В");
//        System.out.print("А = ");
//        int A = in.nextInt( );
//        System.out.print("В = ");
//        int B = in.nextInt( );
//        int n = 0, m = 0;
//        m = B;
//        if (A > B){
//            System.out.println("ERROR!!!");
//        }
//        else
//            for(; A < B; B -= 1 ) {
//            if (B == m)
//                continue;
//            n ++;
//            System.out.println(B);
//            }
//        System.out.println("Цикл выполнялся " + n +" раз");
//

//        4е задание
//        Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
//                2, ..., 10 кг конфет.

////         try {
//             System.out.print("Цена конфетки за кг = ");
//             float ts = in.nextFloat();
//             for (int kg = 1; kg <= 10; kg++) {
//                 System.out.println(kg + " кг конфетка стоит " + (ts * kg) + "p");
//             }
////         }
////         catch (Exception e){
////             System.out.println("Введены некорректные данные. Ошибка " + e);
////             System.out.println("Inconnect data entered. Error " + e);
////         }


////        5е задание
////        Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
////                1.4, ..., 2 кг конфет.
//        System.out.print("Цена конфетки за кг = ");
//        double ts = in.nextFloat();
//        double kg = 12;
//        for( ; kg <= 20 ; kg += 2) {
//            System.out.println(kg/10 + " кг конфетка стоит " + (ts * kg)/10 + "p");
//        }


////        6е задание
//        For5°. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
//                0.2, ..., 1 кг конфет.
//        System.out.print("Цена конфетки за кг = ");
//        double ts = in.nextFloat();
//        double kg = 1;
//        for( ; kg <= 10 ; kg += 1) {
//            System.out.println(kg/10 + " кг конфетка стоит " + (ts * kg)/10 + "p");
//        }


////        7е задание
//        For10. Дано целое число N (> 0). Найти сумму
//        1 + 1/2 + 1/3 + ... + 1/N
//                (вещественное число).
//        System.out.print("Vvedite chislo N ");
//        double N = in.nextDouble( );
//        double i = 0;
//        double M = 1;
//        for (; N > 0; N -= 1 ){
//            i += M/N;
////            System.out.println(N);
////            System.out.println(i);
//        }
//        System.out.println(i);


//        Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от A
//        до B включительно.
        try {
            System.out.print("Введите N ");
            int n = in.nextInt(), b = 1;
            System.out.print("Введите M ");
            int m = in.nextInt();
            for(; m >= n ; n++){
                b *= n;
            }
            System.out.println(b);
        }
             catch (Exception e){
            System.out.println("Введены некорректные данные. Ошибка " + e);
            System.out.println("Inconnect data entered. Error " + e);
        }

        //        8е задание
//        For20°. Дано целое число N (> 0). Используя один цикл, найти сумму
//        1! + 2! + 3! + ... + N!
//                (выражение N! — N–факториал — обозначает произведение всех целых
//        чисел от 1 до N: N! = 1·2·...·N). Чтобы избежать целочисленного пере-
//                полнения, проводить вычисления с помощью вещественных переменных и
//        вывести результат как вещественное число.
        int n = in.nextInt(), s = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "! = " + factUsual(i));
            s += factUsual(i);
        }
        System.out.println(s);
    }
    private static int factUsual(int i) {
        if( i == 1) return 1;
        int fact = 1;
        for (int j = 1; j <= i; j++) {
            fact *= j;
        }
        return fact;

//        9е задание
//        int f = 0;
//        int n = in.nextInt();
//        for (int i = 0; i <= n; i++) {
//            f += factUsual(i);
//        }
//        System.out.println("Сложение всех факториалов равна к " + f);
//    }
//    private static int factUsual(int i) {
//        if(i == 0 || i == 1) return 1;
//        int fact = 1;
//        for (int j = 1; j <= i; j++) {
//            fact *= j;
//        }
//        return fact;



//        10е задание
//        For35. Дано целое число N (> 2). Последовательность целых чисел AK опреде-
//                ляется следующим образом:
//        A1 = 1, A2 = 2, A3 = 3, AK = AK–1 + AK–2 – 2·AK–3, K = 4, 5, ... .
//        Вывести элементы A1, A2, ..., AN.

//        For35。整数N（> 2）が与えられます。整数のシーケンスAKが定義されています
//        以下のとおりであります：
//        A1 = 1、A2 = 2、A3 = 3、AK = AK – 1 + AK – 2-2・AK – 3、K = 4、5、...。
//        要素A1、A2、...、ANを印刷します。



//        System.out.print("Vvedite Ts ");
//        int Ts = in.nextInt();
//        double a1 = 1, a2 = 2, a3 = 3;
//        System.out.printf("A(1): %f \n", a1);
//        System.out.printf("А(2): %f \n", a2);
//        System.out.printf("А(3): %f \n", a3);
//        int i = 0;
//        float k;
//        for (i = 4; i <= Ts; i++) {
//            k = (float) (a3 + a2 - 2 * a1);
//            System.out.printf("A("+ i + ") = %f \n", k);
//            a1 = a2;
//            a2 = a3;
//            a3 = k;
//
//        }
//        return ;
//


    }
}
