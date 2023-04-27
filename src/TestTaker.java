import java.util.ArrayList;
import java.util.List;

public class TestTaker {

    public static String newList(String[] students) {

        StringBuilder sb = new StringBuilder();
        StringBuilder marks = new StringBuilder();
        List<String> list = new ArrayList<>();
        int avgMark = 0;


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < students[i].length(); j++) {
                while (!Character.isDigit(students[i].charAt(j))) {
                    sb.append(students[i].charAt(j));
                    j++;
                }
                if(j < students[i].length()-1){
                if (Character.isDigit(students[i].charAt(j)) && Character.isDigit(students[i].charAt(j + 1))) {
                    marks.append(students[i].charAt(j)).append(students[i].charAt(j + 1)).append(",");
                }}
                if(j < students[i].length()-1){
                if (Character.isDigit(students[i].charAt(j)) && !Character.isDigit(students[i].charAt(j + 1))) {
                    marks.append(students[i].charAt(j)).append(",");
                }}

                if (Character.isDigit(students[i].charAt(j)) && j == students[i].length()) {
                    marks.append(students[i].charAt(j));
                }
                if (j == students[i].length()) {
                    String[] numbersArray = marks.toString().split(" ");

                    int sum = 0;
                    for (String number : numbersArray) {
                        sum += Integer.parseInt(number);
                    }
                    avgMark = sum / numbersArray.length;
                    sb.append(String.valueOf(avgMark));
                    list.add(sb.toString());
                    sb.setLength(0);
                    sum = 0;
                    avgMark = 0;
                    marks.setLength(0);
                }
            }

        }
        return String.valueOf(list);
    }

}
