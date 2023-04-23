public class FiboInt {

    public static int fiboint(int number) {

        int previousTwo = 1;
        int previousOne = 1;
        int sum = 0;

        if (number == 1 || number == 2) {
            return 1;
        }

        for (int i = 3; i <= number; i++) {

            sum += previousTwo + previousOne;
            previousTwo = previousOne;
            previousOne = sum;
            if (i != number) {
                sum = 0;
            }
        }
        return sum;
    }
}
