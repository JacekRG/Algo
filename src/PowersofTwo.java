public class PowersofTwo {

    public static String PowersofTwo(int num) {
        int pow = 0;
        while (Math.pow(2, pow) < num) {
            pow++;
        }
        return String.valueOf(Math.pow(2,pow) == num);
    }
}
