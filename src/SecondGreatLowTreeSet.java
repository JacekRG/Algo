import java.util.Arrays;
import java.util.TreeSet;

public class SecondGreatLowTreeSet {

    public static String SecondGreatLow(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        Arrays.sort(arr);
        String finalString = "";

        if(arr.length == 2){
            return finalString + arr[1] + " " + arr[0];
        }

        for (int i = 1; i < arr.length - 1; i++) {
            set.add(arr[i]);
        }

        if(set.size() == 1){
            return finalString + set.first() + " " + set.first();
        }
        System.out.println("zawartosc Seta: " + set);

        finalString += set.pollFirst() + " " + set.pollLast();
        return finalString;
    }

}
