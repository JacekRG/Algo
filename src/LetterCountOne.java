import java.util.HashMap;

public class LetterCountOne {

    public static String LetterCountI(String str) {

        String[] words = str.split(" ");
        int maxRepeatabillity = 0;
        int idxWord = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words[i].length(); j++) {
                char c = words[i].charAt(j);

                if (!map.containsKey(c)) {

                    map.put(c, 1);

                } else map.put(c, map.get(c) + 1);
                if (maxRepeatabillity < map.get(c)) {
                    maxRepeatabillity = map.get(c);
                    idxWord = i;
                }
            }
            map.clear();
        }
        if (maxRepeatabillity > 1) {
            return words[idxWord];
        } else return ("-1");
    }
}
