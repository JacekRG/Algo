public class Superincreasing {

    public static boolean Superincreasing(int[] arr) {

        int sum = 0;

        for(int i = 0; i<arr.length -1; i++){

            sum += arr[i];
            if(sum <= arr[i + 1]){
                return false;
            }
        }

        return true;
    }
}
