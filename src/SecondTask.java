public class SecondTask {

    public  String stringChallenge(String str) {
        StringBuilder finalString = new StringBuilder();
        int counter = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                counter++;
            } else {
                finalString.append(counter)
                        .append(str.charAt(i-1));
                counter = 1;
            }
        }
        finalString.append(counter)
                .append(str.charAt(str.length()-1));
        return finalString.toString();
    }
}
