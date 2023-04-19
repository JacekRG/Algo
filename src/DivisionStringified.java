public class DivisionStringified {

    public static String DivisionStringified(int num1, int num2) {

        int result = (2 * num1 + num2) / (2 * num2);
        String rest = String.valueOf(result);

        if (rest.length() <= 3) {
            return String.valueOf(Math.round(result));
        } else {
            StringBuilder sb = new StringBuilder();
            int counter = 0;
            for (int i = rest.length() - 1; i >= 0; i--) {
                sb.append(rest.charAt(i));
                counter++;
                if (counter == 3 && i != 0) {
                    sb.append(",");
                    counter = 0;
                }
            }
            return sb.reverse().toString();
        }
    }
}
