import java.util.Arrays;

public class Abelo {

    public static String FirstReverse(String str) {

        String finalString = "";

        for (int i = 0; i<str.length(); i++){
            finalString += str.charAt(str.length()-1-i);
        }
        return finalString;
    }
}
