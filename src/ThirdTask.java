public class ThirdTask {

    public static int stringTimeChallenge(String str) {
        String[] separatedTimes = str.split("-");
        int minutes = 0;
        for (int i = 0; i < separatedTimes.length; i++) {
            String time = separatedTimes[i];
            String[] splittedInitialTime = time.split(":");
            String stringOfInitialHour = splittedInitialTime[0];
            int hours = Integer.parseInt(stringOfInitialHour);
            int minutesInHours = hours * 60;
            String stringOfInitialMinute = splittedInitialTime[1];
            int minutesOfDay = minutesInHours + Integer.parseInt(stringOfInitialMinute.substring(0, stringOfInitialMinute.length() - 2));
            if (time.contains("pm") && hours != 12) {
                minutesOfDay += 12 * 60;
            } else if (time.contains("am") && hours == 12) {
                minutesOfDay -= 12 * 60;
            }
            minutes += minutesOfDay;
        }
        if (separatedTimes.length > 1 && minutes % (24 * 60) < 0) {
            minutes += 24 * 60;
        }
        return Math.abs(minutes % (24 * 60));
    }
}