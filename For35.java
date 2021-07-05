package com.company;

import java.util.Scanner;

public class For35 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);



        //        10е задание
//        For35. Дано целое число N (> 2). Последовательность целых чисел AK опреде-
//                ляется следующим образом:
//        A1 = 1, A2 = 2, A3 = 3, AK = AK–1 + AK–2 – 2·AK–3, K = 4, 5, ... .
//        Вывести элементы A1, A2, ..., AN.

//        For35。整数N（> 2）が与えられます。整数のシーケンスAKが定義されています
//        以下のとおりであります：
//        A1 = 1、A2 = 2、A3 = 3、AK = AK – 1 + AK – 2-2・AK – 3、K = 4、5、...。
//        要素A1、A2、...、ANを印刷します。

//         на паскале
//                program For35;
//                var
//                k,k1,k2, k3 :Real;
//                Ts, i :Integer;
//                begin
//                Write('Введите Ts: ');
//                Readln(Ts);
//                Writeln('Значения функции:');
//                Writeln('A(1)=1');
//                Writeln('A(2)=2');
//                Writeln('A(3)=3');
//                k1:=1;
//                k2:=2;
//                k3:=3;
//                For i:=4  to Ts do
//                    begin
//                k:=k3+k2-2*k1;
//                Writeln('A(',i,')=',k);
//                k1:=k2;
//                k2:=k3;
//                k3:=k;
//                end;
//                end.

        //        10е задание
        System.out.print("Vvedite Ts ");
        int Ts = in.nextInt();
        double a1 = 1, a2 = 2, a3 = 3;
        System.out.printf("A(1): %f \n", a1);
        System.out.printf("А(2): %f \n", a2);
        System.out.printf("А(3): %f \n", a3);
        int i = 0;
        float k;
        for (i = 4; i <= Ts; i++) {
            k = (float) (a3 + a2 - 2 * a1);
            System.out.printf("A("+ i + ") = %f \n", k);
            a1 = a2;
            a2 = a3;
            a3 = k;

        }
        return ;




    }

}
