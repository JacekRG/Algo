import java.util.HashMap;

public class MeanMode {

    public static int MeanMode(int[] arr) {

        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        int repeatableCounter = 0;

        for (int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(!map.containsKey(i)){
                map.put(i, 1);
            } else map.put(i, map.get(i) + 1);
            if(map.get(i) > repeatableCounter){
                repeatableCounter = map.get(i);
                index = i;
            }
        }
        if(arr[index]  == sum/arr.length){
            return 1;} else return 0;
    }
}
