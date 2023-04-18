public class ThirdTask_MEINE {

    public int stringTimeChallenge(String str) {

        String[] splittedTimes = str.split("-");

        String[] splittedInitialTime = splittedTimes[0].split(":");
        String[] splittedEndTime = splittedTimes[1].split(":");

        int initialHourToMinute = Integer.parseInt(splittedInitialTime[0]) * 60;
        int initialMinuteWithoutMark = Integer.parseInt(splittedInitialTime[1].substring(0, 2));

        int dailyElapsedInitialTime = 0;
        if (splittedInitialTime[1].contains("am")) {
            dailyElapsedInitialTime = initialHourToMinute + initialMinuteWithoutMark;
        }
        if (splittedInitialTime[1].contains("pm")) {
            dailyElapsedInitialTime = initialHourToMinute + initialMinuteWithoutMark + 12 * 60;
        }

        int endHourToMinute = Integer.parseInt(splittedEndTime[0]) * 60;
        int endMinuteWithoutMark = Integer.parseInt(splittedEndTime[1].substring(0, 2));

        int dailyElapsedEndTime = 0;
        if (splittedEndTime[1].contains("am")) {
            dailyElapsedEndTime = endHourToMinute + endMinuteWithoutMark;
        }
        if (splittedEndTime[1].contains("pm")) {
            dailyElapsedEndTime = endHourToMinute + endMinuteWithoutMark + 12 * 60;
        }

        int timeDifference = 0;
        if (dailyElapsedEndTime >= dailyElapsedInitialTime) {
            timeDifference = dailyElapsedEndTime - dailyElapsedInitialTime;
        } else timeDifference = 24 * 60 - dailyElapsedInitialTime + dailyElapsedEndTime;


        return timeDifference;
    }
}
