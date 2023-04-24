public class OverlappingRanges {

    public static boolean OverlappingRanges(int[] arr) {

        int lapCounter = 0;
        boolean isTrue = false;

        if(arr[2] >= arr[0] &&  arr[3] <= arr[1]){
            lapCounter = arr[3] - arr[2] + 1;
            isTrue = lapCounter >= arr[arr.length - 1];
        }

        if(arr[2] >= arr[0] &&  arr[3] > arr[1]){
            lapCounter = arr[1] - arr[2]  +1;
            isTrue = lapCounter >= arr[arr.length - 1];
        }

        if(arr[2] < arr[0] &&  arr[3] <= arr[1]){
            lapCounter = arr[3] - arr[0] + 1;
            isTrue = lapCounter >= arr[arr.length - 1];
        }

        if(arr[2] < arr[0] &&  arr[3] > arr[1]){
            lapCounter = arr[1] - arr[0] + 1;
            isTrue = lapCounter >= arr[arr.length - 1];

        }
        return isTrue;
    }
}
