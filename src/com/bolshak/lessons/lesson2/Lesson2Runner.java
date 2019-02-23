package com.bolshak.lessons.lesson2;

public class Lesson2Runner {
    public static void main(String[] args) {

//        long number1 = 10_000_000_000L;
//        int number2 = (int)10L;
//        int number3 = (int)number1;
//        System.out.println(number3);
        int minutesAtWeek = 3*7*24*60*60;
        System.out.println(minutesAtWeek);

        long secondsFrom01121970= System.currentTimeMillis()/1000;
        long seconds = secondsFrom01121970%60;
        secondsFrom01121970/=60;
        long mm =secondsFrom01121970%60;
        secondsFrom01121970/=60;
        long hh = secondsFrom01121970%24+2;
        secondsFrom01121970/=24;

        System.out.println( secondsFrom01121970+":"+hh+":"+mm+":"+seconds);

        double startPrise = 5000.0;
        double percent = 15;
        startPrise = (100-percent)/100*startPrise;
        System.out.println(startPrise);
        double persante2 = 35.0;
        double newPrice =  (100+persante2)/100*startPrise;
        System.out.println(newPrice);


    }
}
