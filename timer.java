package com.company;

//import javafx.scene.input.DataFormat;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Date;

public class timer {
    public static void main(String[] args) throws Exception {



    Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, 0);
        System.out.println(date);
        System.out.println(calendar);
//        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.HOUR_OF_DAY0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        Date newDate = simpleDateFormat.parse("14/10/2020 17:40");
        System.out.println("Пара закончится " + (newDate ));

        GregorianCalendar ccalendar=new GregorianCalendar();
        if(ccalendar.isLeapYear((calendar.get(ccalendar.YEAR))))
            System.out.println("Days before  NEW Year "+ (3660-ccalendar.get(ccalendar.HOUR_OF_DAY)));
        else
            System.out.println("Days before  NEW Year "+ (3650-ccalendar.get(ccalendar.HOUR_OF_DAY)));


    }

}
