public class SecondGreatLow {

    public static String SecondGreatLow(int[] arr) {

        String finalString = "";
        int ndSmall = arr[0];
        int ndBig = arr[arr.length-1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > ndSmall){
                ndSmall = arr[i];
                break;
            }
        }
        for(int j = 0; j < arr.length; j++){
            if(arr[arr.length-1-j] < ndBig){
                ndBig = arr[arr.length-1-j];;
                break;
            }
        }
        finalString += ndSmall + ":" + ndBig;
        return finalString;
    }
}
