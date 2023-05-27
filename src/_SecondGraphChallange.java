import java.util.*;

public class _SecondGraphChallange {
    HashMap<Integer, List<Integer>> map;

    public static void main(String[] args) {
        String[] testen = {"1:[5]", "2:[5,18]", "3:[5,12]", "4:[5]", "5:[1,2,3,4]", "18:[2]", "12:[3]"};
        _SecondGraphChallange graphChallange = new _SecondGraphChallange();

        HashMap<Integer, List<Integer>> cityMap = graphChallange.convertToMap(testen);

        System.out.println(cityMap);
    }

    public  HashMap<Integer, List<Integer>> convertToMap(String[] input) {
        map = new HashMap<>();
        for (String s : input) {
            String[] split = s.split(":"); // Rozbijamy na klucz i wartość

            Integer key = Integer.parseInt(split[0]); // Przetwarzamy klucz na Integer

            // Usuwamy nawiasy kwadratowe i dzielimy wartości przecinkami, przetwarzamy na Integer i dodajemy do listy
            List<Integer> values = new ArrayList<>();
            for (String strValue : split[1].replace("[", "").replace("]", "").split(",")) {
                values.add(Integer.parseInt(strValue.trim()));
            }

            map.put(key, values); // Dodajemy klucz i wartości do mapy
        }
        return map;
    }
}
