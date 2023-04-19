public class TimeConvert {

    public static String TimeConvert(int num) {

        String result = "";
        int hoursAmount = Math.floorDiv(num,60);
        result = hoursAmount +":"
                + (num-(hoursAmount*60));
        return result;
    }

}
