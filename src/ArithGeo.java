public class ArithGeo {

    public static String ArithGeo(int[] arr) {


        int geoCounter = 0;
        int arithCounter = 0;
        for (int i = 1; i < arr.length - 1; i++) {

            if ((arr[i] - arr[i - 1]) == (arr[i + 1] - arr[i])) {
                arithCounter++;
            }
            if (arr[i] / (double)arr[i - 1] == (arr[i + 1] / (double)arr[i])) {
                geoCounter++;
            }

        }
        if (arithCounter == arr.length - 2) {
            return "Arithmetic";
        }
        if (geoCounter == arr.length - 2) {
            return "Geometric";
        } else return "-1";
    }
}

