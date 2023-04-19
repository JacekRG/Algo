import java.util.HashMap;

public class CountingMinutes {

    public static String CountingMinutesI(String str) {

        String[] splittedString = str.split("-");
        String[] startTime = splittedString[0].split(":");
        String[] endTime = splittedString[1].split(":");

        int startHoursElapsed = 0;
        int startMinutesElapsed = 0;
        int endHoursElapsed = 0;
        int endMinutesElapsed = 0;

        if(isPm(startTime[1])){
            startMinutesElapsed = 12*60 + 60*Integer.parseInt(startTime[0])
                    +  Integer.parseInt(startTime[1].substring(0,2));
        } else  startMinutesElapsed = 60*Integer.parseInt(startTime[0])
                + Integer.parseInt(startTime[1].substring(0,2));

        if(isPm(endTime[1])){
            endMinutesElapsed = 12*60 + 60*Integer.parseInt(endTime[0])
                    +  Integer.parseInt(endTime[1].substring(0,2));
        } else  endMinutesElapsed = 60*Integer.parseInt(endTime[0])
                + Integer.parseInt(endTime[1].substring(0,2));
            if(endMinutesElapsed >= startMinutesElapsed){
        return String.valueOf(Math.abs(endMinutesElapsed - startMinutesElapsed));
    } else return String.valueOf(Math.abs(endMinutesElapsed-startMinutesElapsed+24*60));
    }

    public static boolean isPm(String mark){
        return mark.contains("pm");
    }

}
