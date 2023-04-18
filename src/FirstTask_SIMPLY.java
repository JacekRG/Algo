public class FirstTask_SIMPLY {

    public int arrayChallenge(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int profit = 0;
        int lowestNotLastPrice = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int valueDiff = arr[i] - lowestNotLastPrice;
            if (valueDiff > profit) {
                profit = valueDiff;
            }
            if (arr[i] < lowestNotLastPrice) {
                lowestNotLastPrice = arr[i];
            }
        }
        if (profit == 0) {
            return -1;
        }
        return profit;
    }
}
