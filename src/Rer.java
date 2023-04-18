public class Rer {

    public   int firstFactorial(int num) {

        if(num<1 || num>18) return 0;
        int factorial = 1;

        for(int i = 1; i <=num ; i++){

            factorial *=i; }


        return factorial;
    }

}
