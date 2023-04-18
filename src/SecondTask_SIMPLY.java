public class SecondTask_SIMPLY {

    public  String stringChallenge2(String str) {
        String finalString = "";
        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                counter++;
            } else {
                finalString = finalString + counter
                        + str.charAt(i-1);
                counter = 1;
            }
        }
        finalString = finalString + counter
                + str.charAt(str.length()-1);
        return finalString;
    }
}
