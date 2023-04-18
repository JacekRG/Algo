public class ThirdTask_MEINE2 {

    public int stringTimeChallenge(String str) {
        String[] times = str.split("-");
        int[] dailyElapsedTimes = new int[2];
        for (int i = 0; i < 2; i++) {
            String[] splittedTime = times[i].split(":");
            int hourToMinute = Integer.parseInt(splittedTime[0]) * 60;
            int minuteWithoutMark = Integer.parseInt(splittedTime[1].substring(0, 2));
            if (splittedTime[1].contains("pm")) {
                hourToMinute += 12 * 60;
            }
            dailyElapsedTimes[i] = hourToMinute + minuteWithoutMark;
        }
        int timeDifference = dailyElapsedTimes[1] - dailyElapsedTimes[0];
        if (timeDifference < 0) {
            timeDifference += 24 * 60;
        }
        return timeDifference;
    }
}
