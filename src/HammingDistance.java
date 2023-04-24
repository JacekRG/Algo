public class HammingDistance {

    public static int HammingDistance(String[] strArr) {

        int result = 0;

        for(int i = 0; i < strArr[0].length(); i++){
            if(strArr[0].charAt(i) != strArr[1].charAt(i) ){
                result++;
            }
        }
        return result;
    }
}
