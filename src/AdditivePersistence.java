import java.util.ArrayList;
import java.util.List;

public class AdditivePersistence {

    public static int AdditivePersistence(int num) {

        if (num <= 9) {
            return 0;
        }
        int restSum = 0;
        int counter = 1;
        List<String> list = new ArrayList<>();
        String stringNum = String.valueOf(num);
        list.add(stringNum);

        for (int i = 0; i < list.size(); i++) {
            for (int k = 0; k < list.get(i).length(); k++) {
                restSum += Integer.parseInt(String.valueOf(list.get(i).charAt(k)));
            }
            if (restSum > 9) {
                list.add(String.valueOf(restSum));
                restSum = 0;
                counter++;
            }
        }
        return counter;
    }
}

