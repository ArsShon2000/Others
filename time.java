package com.company;
import java.util.*;

public class time {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        int dd = (calendar.get(calendar.DAY_OF_MONTH));
        int hh = (calendar.get(calendar.HOUR_OF_DAY) );
        int mm = (calendar.get(calendar.MINUTE));
        int ss = (calendar.get(calendar.SECOND));



        if (dd <= 14 && hh - 14 <= 0 || dd == 14 && hh - 14 <= 0 && mm - 30 <= 0  )
            System.out.println("Пара не началась. до начала пара " + (14 - dd)+ " д " + (( 14 - hh) )+ " ч (" + (59 - mm) + " мин) " + (59 - ss + " сек"));
        if (dd < 14 )
            System.out.println("Пара не началась. до начала пара " + (13 - dd)+ " д " + (( 16 - hh) )+ " ч (" + (59 - mm) + " мин) " + (59 - ss + " сек"));
        if (dd > 13 && hh - 16 >= 0 || dd > 13 && hh > 16 )
            System.out.println("Пара закончилась. Прошло"  + (14 - dd)+ " д " + ((16 - hh) )+ " ч " + ( mm) + " мин "+ ( ss + " сек"));
//        else if (dd == 14 && hh >= 14 && mm >= 30 && hh <= 16 )
//            System.out.println("До окончание урока остался " + (14 - dd)+ " д " + ((15 -  hh ) )+ " ч (" + (59 - mm) + " мин) " + (59 - ss + " сек") );
        if (dd == 14 && hh >= 14 && mm >= 30 && hh < 16) {
            System.out.println("Пара идет");
            System.out.println("До окончание урока остался " + (14 - dd) + " д " + ((15 - hh)) + " ч " + (59 - mm) + " мин " + (59 - ss + " сек"));
        }
        else
            System.out.println("Пара не идет");

    }
}