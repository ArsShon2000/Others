package com.company;
import java.util.Scanner;
import java.io.*;
import java.util.GregorianCalendar;
public class Num16 {
    // Текстовый файл содержит строки вида "фамилия имя отчество:год_рождения:
// номер_телефона", например:
// Иванов Иван Иванович:2002:+7(926)111-22-33
// Петров Петр Петрович:2002 : +7(916)111-22-33
// Строки состоят из трех смысловых частей, в них могут присутствовать
// нежелательные пробельные символы.
// Напишите программу, вычисляющую количество людей с именем Иван,
// возраст которых не превышает 20 лет
    public static void main(String[] args) throws Exception {
        GregorianCalendar calendar = new GregorianCalendar();
        int year = (calendar.get(calendar.YEAR)) - 20;
        FileReader fr = new FileReader("text.txt");
        Scanner in = new Scanner(fr);
        int a = 0;
        while (in.hasNextLine()) {
            String str = in.nextLine();
            String[] strArr = str.split(":");
            if (strArr[1].trim().compareTo(String.valueOf(year)) >= 0) {
                if (strArr[0].contains(" Иван "))
                    a++;

            }
        }
        System.out.println("Иваны, которые меньше и 20 лет " + a);

    }


}
