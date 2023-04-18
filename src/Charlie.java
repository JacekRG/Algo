public class Charlie {

    public static String LetterCapitalize(String str) {

        String finalString = "";

        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                finalString += String.valueOf(Character.toUpperCase(str.charAt(i)));
                continue;
            }
            if (str.charAt(i - 1) == ' ') {
                finalString += String.valueOf(Character.toUpperCase(str.charAt(i)));
            } else finalString += String.valueOf(str.charAt(i));
        }
        return finalString;
    }

}