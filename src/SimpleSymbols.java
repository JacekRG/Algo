public class SimpleSymbols {

    public static boolean simpleSymbols(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.length()< 3 || str.charAt(0) != '+' && str.toLowerCase().charAt(1) >= 'a' && str.toLowerCase().charAt(1) <= 'z')
                return false;
            if (str.toLowerCase().charAt(i) >= 'a' && str.toLowerCase().charAt(i) <= 'z') {
                if (i < str.length() - 1 && str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    return false;
                }
            }
        }
        return true;
    }
}
