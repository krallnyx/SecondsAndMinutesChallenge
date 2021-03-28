package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        // int mns = 453;
        int sec = 34465;
        // System.out.println(getDurationString(mns, sec));
        System.out.println(getDurationString(sec));
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && seconds < 60) {
            int hours = minutes / 60;
            minutes = minutes % 60;
            String strHours;
            String strMinutes;
            String strSeconds;
            if (hours < 10) {
                strHours = "0" + hours;
            } else {
                strHours = "" + hours;
            }
            if (minutes < 10) {
                strMinutes = "0" + minutes;
            } else {
                strMinutes = "" + minutes;
            }
            if (seconds < 10) {
                strSeconds = "0" + seconds;
            } else {
                strSeconds = "" + seconds;
            }
            return (strHours + "h " + strMinutes+ "m " + strSeconds + "s");
        }
        return INVALID_VALUE_MESSAGE;
    }

    private static String getDurationString(int seconds) {
        if (seconds >= 0) {
            return getDurationString(seconds / 60, seconds % 60);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
