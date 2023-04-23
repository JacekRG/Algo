public class ChangingSequence {

    public static int ChangingSequence(int[] arr) {

        int index = -1;

        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                index = i;
            }
            if(arr[i] < arr[i - 1] && arr[i] < arr[i + 1]){
                index = i;
            }
        }
        return index;
    }
}
