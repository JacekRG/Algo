import java.util.Arrays;

public class AlphabetRunEncryptionSecond {

    public static String AlphabetRunEncryption(String str) {

        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder finalSb = new StringBuilder();
        StringBuilder helpSb = new StringBuilder();
        String stringAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String reversedAlphabet = "zyxwvutsrqponmlkjihgfedcba";

        StringBuilder builderAlphabet = new StringBuilder(stringAlphabet);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'S' && chars[i] != 'R' && chars[i] != 'L' && chars[i] != 'N') {
                sb.append(chars[i]);
            } else continue;
            if (i > 0) {
                if (chars[i - 1] == 'S' && chars[i - 1] == 'R' || chars[i - 1] == 'L' || chars[i - 1] == 'N' || chars[i] == chars[i+1]) {
                    helpSb.append(sb.toString().charAt(0)).append(sb.charAt(sb.length() - 1));
                    sb.setLength(0);
                }
            }
            if (i >= 3) {
                if (chars[i] == 'S' && chars[i - 3] == 'S') {
                    finalSb.append(chars[i - 1]);
                } else if (chars[i] == 'S' && chars[i - 3] != 'S') {
                    finalSb.append(chars[i - 2]).append(chars[i - 1]);
                }
            }
            if (i < 3) {
                if (chars[i] == 'S') {
                    finalSb.append(chars[i - 2]).append(chars[i - 1]);
                }
            }
            if (i >= 4) {
                if (stringAlphabet.contains(sb) && chars[i] + 1 == chars[i + 1] && helpSb.length() == 2) {
                    finalSb.append((char) (helpSb.toString().charAt(0) + 1)).append(helpSb.charAt(1) - 1);
                    helpSb.setLength(0);
                }
                if (reversedAlphabet.contains(sb) && chars[i] - 1 == chars[i + 1] && helpSb.length() == 2) {
                    finalSb.append((char) (helpSb.toString().charAt(0) - 1)).append(helpSb.charAt(1) + 1);
                    helpSb.setLength(0);

                }
            }
            if (chars[i] == 'R') {
                finalSb.append((char) (chars[i - 1] - 1));
                finalSb.append((char) (chars[i - 1] + 1));
            }
            if (chars[i] == 'L') {
                finalSb.append((char) (chars[i - 1] + 1));
                finalSb.append((char) (chars[i - 1] - 1));
            }
        }
        return finalSb.toString();
    }
}
