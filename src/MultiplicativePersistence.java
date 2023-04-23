public class MultiplicativePersistence {

    public static int MultiplicativePersistence(int num) {
        int counter = 0;
        if (num < 10) {
            return 0;
        }
        int baseNum = num;
        while (baseNum > 9) {
            baseNum = multiplyDigits(baseNum);
            counter++;
        }
        return counter;
    }

    public static int multiplyDigits(int number) {
        int multi = 1;
        String stringFromSb = String.valueOf(number);
        for (int i = 0; i < stringFromSb.length(); i++) {
            multi *= Integer.parseInt(String.valueOf(stringFromSb.charAt(i)));
        }
        return multi;
    }
}
