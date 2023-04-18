public class Exer {

    public String stringChallange(String str) {
        String finalString = "";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            counter = 0;
            for (int j = 1; j < str.length() - 1; j++) {
                if ((i + j) >= str.length()) {
                    ++counter;
                    break;
                }
                if (str.charAt(i + j) != str.charAt(i)) {
                    counter++;
                    break;
                } else counter++;
            }
            finalString = finalString + counter + str.charAt(i);
            i = i + counter - 1;
        }
        return finalString;
    }
}