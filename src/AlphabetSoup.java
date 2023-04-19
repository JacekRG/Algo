import java.util.Arrays;

public class AlphabetSoup {


    public static String AlphabetSoup(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(c);
            }
        }
        char[] chars = sb.toString().toCharArray();
        Arrays.sort(chars);
        sb = new StringBuilder(new String(chars));

        return sb.toString();
    }
}

