public class LetterChanges {

    public static String LetterChanges(String str) {

//        char[] chars = str.toCharArray();
        String finalString = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.toLowerCase().charAt(i);
            if(c<'a' || c>'z'){
                finalString += String.valueOf(c);
                continue;
            }
            if (String.valueOf(c).matches("[zdhnt]")) {
                c = Character.toUpperCase(c);
            }
            finalString += String.valueOf(++c);
        }
        return finalString;
    }
}
