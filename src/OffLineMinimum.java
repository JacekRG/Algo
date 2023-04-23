import java.util.Arrays;
import java.util.LinkedList;

public class OffLineMinimum {

    public static String OffLineMinimum(String[] strArr) {

        LinkedList<String> list = new LinkedList<>(Arrays.asList(strArr));
        StringBuilder sb = new StringBuilder();
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int i = 0; i < list.size(); i++){

            if(Character.isDigit(list.get(i).charAt(0))){
            if(Integer.parseInt(list.get(i)) < minValue){
                minValue = Integer.parseInt(list.get(i));
                minIndex = i;
            }}
            if(list.get(i).equals("E")){

                sb.append(list.remove(minIndex)).append(",");
                list.remove(i-1);
                i = -1;
                minValue = Integer.MAX_VALUE;
            }
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
