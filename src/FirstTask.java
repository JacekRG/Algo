public class FirstTask {
    public int arrayChallenge(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }
        int minStockValue = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {
            int currentStockValue = arr[i];
            int valueDiff = currentStockValue - minStockValue;
            if (valueDiff > maxProfit) {
                maxProfit = valueDiff;
            }
            if (currentStockValue < minStockValue) {
                minStockValue = currentStockValue;
            }
        }
        if (maxProfit == 0) {
            return -1;
        }
        return maxProfit;
    }
}
