package net.smerdel;

public class Calculate {

    public static String getDurationString(int minutes, int seconds){

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        int totalMinutes = minutes + (seconds / 60);
        int totHours = totalMinutes / 60;
        String ifValid = totHours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        String inValid = "Invalid Value";

        if (minutes >= 0 && seconds >= 0){
            return ifValid;
        } else {
            return inValid;
        }
    }

//    public static String getDurationString(int seconds){
//
//        int remainingSeconds = seconds % 60;
//        int totalMinutes = seconds / 60;
//        int totHours = totalMinutes / 60;
//        String ifValid = totHours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
//        String inValid = "Invalid Value";
//
//        if (seconds >= 0){
//            return ifValid;
//        } else {
//            return inValid;
//        }
//    }
}
