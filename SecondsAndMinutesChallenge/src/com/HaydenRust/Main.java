package com.HaydenRust;

import java.sql.SQLOutput;

public class Main {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(-1,10));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString (int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0 || seconds > 59)){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (minutes / 60);
        int remainingMinutes = (minutes % 60);

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "h";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "h";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString + "";

    }

    public static String getDurationString (int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = (seconds / 60);
        int remainingSeconds = (seconds % 60);
        return getDurationString(minutes,remainingSeconds);
    }
}
