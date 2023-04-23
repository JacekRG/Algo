import java.util.Collections;
import java.util.TreeMap;

public class ThirdGreatest {

    public static String ThirdGreatest(String[] words) {

        int longOne = 0;
        int longTwo = 0;
        int longThree = 0;
        int indexOne = 0;
        int indexTwo = 0;
        int index = 0;

        for(int i = 0; i < words.length; i++){
            if(words[i].length() > longOne){
                index = indexTwo;
                longTwo = longOne;
                indexTwo = indexOne;
                longOne = words[i].length();
                indexOne = i;
                continue;
            }
            if(words[i].length() <= longOne &&  words[i].length() >= longTwo){
                longThree = longTwo;
                index = indexTwo;
                longTwo = words[i].length();
                indexTwo = i;
                continue;
            }
            if(words[i].length() <= longOne &&  words[i].length() <= longTwo
                                            &&  words[i].length() >= longThree){
                longThree = words[i].length();
                index = i;
            }
        }
        return words[index];
    }
}
