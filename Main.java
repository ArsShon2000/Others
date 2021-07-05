
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date lection = new Date();
        int beginningOfTheDay = 9;
        int endOfTheDay = 21;
        int day = lection.getDay();
        int hour = lection.getHours();
        int minutes =lection.getMinutes();
        if (day == 7 || hour < beginningOfTheDay || hour > endOfTheDay) {
            System.out.println("Свободное время");
        } else if (hour == 9) {
            if (minutes >= 30) {
                System.out.println("До конца пары осталось " + (60 - (minutes - 30)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (10 - 9) + " час " + (30 - minutes) + " минут");
            }
        } else if (hour == 10 & minutes <= 30) {
            System.out.println("До конца пары осталось " + (30 - minutes) + " минут");
        } else if (hour == 10 & minutes >= 40) {
            System.out.println("До конца пары осталось " + (11 - 10) + " час " + (70 - minutes) + " минут");
        } else if (hour == 11) {
            if (minutes >= 10) {
                System.out.println("До конца пары осталось " + (60 - (minutes - 10)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (12 - 11) + " час " + (10 - minutes) + " минут");
            }
        } else if (hour == 12 & minutes <= 10) {
            System.out.println("До конца пары осталось " + (10 - minutes) + " минут");
        } else if (hour == 12 & minutes >= 20) {
            if (minutes >= 50) {
                System.out.println("До конца пары осталось " + (60 - (minutes - 50)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (10 - 9) + " час " + (50 - minutes) + " минут");
            }
        } else if (hour == 13 & minutes <= 50) {
            System.out.println("До конца пары осталось " + (50 - minutes) + " минут");
        } else if (hour == 14 & minutes >= 30) {
            System.out.println("До конца пары осталось " + (12 - 11) + " час " + (60 - minutes) + " минут");
        } else if (hour == 15) {
            if (minutes >=0) {
                System.out.println("До конца пары осталось " + (60 - (minutes)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (12 - 11) + " час " + ( minutes) + " минут");
            }
        }
        else if (hour == 16 & minutes <= 0) {
            System.out.println("До конца пары 0 минут");
        }
        else if (hour == 16 & minutes >= 10) {
            if (minutes >= 40) {
                System.out.println("До конца пары осталось " + (60 - (minutes - 40)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (10 - 9) + " час " + (40 - minutes) + " минут");
            }
        }
        else if (hour == 17 & minutes <= 40) {
            System.out.println("До конца пары осталось "+ (40-minutes) +" минут");
        }
        else if (hour == 17 & minutes >= 50) {
            System.out.println("До конца пары осталось " + (12 - 11) + " час " + (60 - (minutes-20)) + " минут");
        }
        else if (hour == 18) {
            if (minutes >= 20) {
                System.out.println("До конца пары осталось " + (60 - (minutes - 20)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (10 - 9) + " час " + (20 - minutes) + " минут");
            }
        }
        else if (hour == 19 & minutes <= 20) {
            System.out.println("До конца пары осталось " + (20 -minutes) + " минут");
        }
        else if (hour == 19 & minutes >= 30) {
            System.out.println("До конца пары осталось " + (12 - 11) + " час " + (60 - minutes) + " минут");
        }
        else if (hour == 20) {
            if (minutes >=0) {
                System.out.println("До конца пары осталось " + (60 - (minutes)) + " минут");
            } else {
                System.out.println("До конца пары осталось " + (12 - 11) + " час " + ( minutes) + " минут");
            }
        }
        else if (hour == 21 & minutes <= 0) {
            System.out.println("До конца пары 0 минут");
        }
        else{
            System.out.println("Свободное время");
        }
    }


}
