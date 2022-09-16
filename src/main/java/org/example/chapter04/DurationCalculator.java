package org.example.chapter04;

public class DurationCalculator {

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || !( seconds >= 0 && seconds <= 59))
            return "Invalid Value";

        //1 hour = 60 minutes
        int hour = minutes / 60;
        int remainingMinutes = minutes % 60;

        //XXh YYm ZZs
        return (hour + "h " + remainingMinutes + "m " + seconds + "s");
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0)
            return "Invalid Value";

        //1 minute = 60 seconds
        int minute = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minute, remainingSeconds);
    }
}
