import java.util.Arrays;

public class ArrayAdditionFirst {

    public static boolean ArrayAdditionI(int[] arr) {

        int sumNoMax = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            sumNoMax += arr[i];
        }
        return sumNoMax >= arr[arr.length - 1];
    }
}
