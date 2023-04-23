public class Fibo {

    public static int fibo(int number) {

        int result = 0;

        if (number == 1 || number == 2) {
            return 1;
        }
        result += fibo(number - 1) + fibo(number - 2);
        return result;
    }
}
