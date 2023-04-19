import java.util.HashMap;

public class SearchingTokenChallenge {
    public static String SearchingChallenge(String str) {

        String token = "kamcw2hp76";
        String[] words = str.split(" ");

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int maxCounter = 0;
        int wordIndex = 0;
        String finalWord = "";
        String superWord = "";

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                if (!map.containsKey(words[i].charAt(j))) {
                    map.put(words[i].charAt(j), 1);
                } else map.put(words[i].charAt(j), map.get(words[i].charAt(j)) + 1);
                if (map.get(words[i].charAt(j)) > maxCounter) {
                    maxCounter = map.get(words[i].charAt(j));
                    wordIndex = i;
                }
            }
            map.clear();
        }
        for (int k = 1; k < words[wordIndex].length(); k++) {
            if (k == 1) {
                finalWord += String.valueOf(words[wordIndex].charAt(k - 1));
            }
            ;
            if (words[wordIndex].charAt(k) == words[wordIndex].charAt(k - 1)) {

                finalWord += String.valueOf(words[wordIndex].charAt(k));
            }
            if (k < words[wordIndex].length() - 2) {
                finalWord += String.valueOf(words[wordIndex].charAt(k));
            }
            if (k == words[wordIndex].length() - 1) {
                finalWord += String.valueOf(words[wordIndex].charAt(k));

            }

        }
        System.out.println("finalword befotr: " + finalWord);
        finalWord = finalWord.concat(token);
        System.out.println("finalword: " + finalWord);
        if (maxCounter > 1) {
            superWord = addUnderlines(finalWord, superWord);
            return superWord;
        } else superWord = addUnderlines("-1".concat(token), superWord);
        return superWord;
    }

    private static String addUnderlines(String finalWord, String superWord) {
        for (int p = 0; p < finalWord.length(); p++) {

            if (p > 0 && (p + 1) % 4 == 0) {
                superWord += '_';
            } else superWord += finalWord.charAt(p);
        }
        return superWord;
    }
}

