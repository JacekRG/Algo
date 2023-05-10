public class Main {
    public static void main(String[] args) {

//        Exer exer = new Exer();
        FirstTask firstTask = new FirstTask();
        FirstTask_SIMPLY firstTaskSIMPLY = new FirstTask_SIMPLY();
        SecondTask secondTask = new SecondTask();
        SecondTask_SIMPLY secondTask_simply = new SecondTask_SIMPLY();
        ThirdTask thirdTask = new ThirdTask();
        ThirdTask_MEINE thirdTask_meine = new ThirdTask_MEINE();
        ThirdTask_MEINE2 thirdTask_meine2 = new ThirdTask_MEINE2();
        Rer rer = new Rer();

        String string = secondTask.stringChallenge("wwwbbbw");
        String string2 = secondTask_simply.stringChallenge2("wwwbbbw");

        int[] array = {44,30,24,32,35,30,40,38,15};
        int arrayChallenge = firstTask.arrayChallenge(array);
        int arrayChallenge1 = firstTaskSIMPLY.arrayChallenge(array);
        int stringTimeChallenge = thirdTask.stringTimeChallenge("1:23am-1:08am");
        int meineTimeChallenge = thirdTask_meine.stringTimeChallenge("1:23am-1:08am");
        int meineFinal = thirdTask_meine2.stringTimeChallenge("1:23am-1:08am");
        int firstFactorial = rer.firstFactorial(9);

//        System.out.println("task2:        " + string);
//        System.out.println("-------------------------");
//        System.out.println("task2 simply: " + string2);
//        System.out.println("**************************");
//        System.out.println("Task 1:        " + arrayChallenge);
//        System.out.println("-------------------------");
//        System.out.println("Task 1 simply: " + arrayChallenge1);
//        System.out.println("**************************");
//        System.out.println("Task 3:          " + stringTimeChallenge);
//        System.out.println("Task 3 MEINE:    " + meineTimeChallenge);
//        System.out.println("Task 3 Final:    " + meineFinal);
//        System.out.println("**************************");
//        System.out.println("First Factorial: " + firstFactorial);
//        System.out.println("Abelo: " + Abelo.FirstReverse("Motel"));
//        System.out.println("LC:         :" + LetterChanges.LetterChanges("fun times!"));
//        System.out.println("SimplySymbols:         :" + SimpleSymbols.simpleSymbols("2+a+a+"));
//        System.out.println("CheckNums              : " + CheckNums.CheckNums(4,5));
//        System.out.println("SearchningTokenChallenge  : " + SearchingTokenChallenge.SearchingChallenge("No words"));
//        System.out.println("ABCheck:                  : " + ABCheck.ABCheck("aloobe"));
//        System.out.println("Palindrome                  : " + Palindrome.Palindrome("do geese see god"));
//        System.out.println("Arith geo : " + ArithGeo.ArithGeo(new int[]{1,2,3,4}));
//        System.out.println("Array Addition One: " + ArrayAdditionFirst.ArrayAdditionI(new int[] {3,4,6}));
//        System.out.println("Letter Count One          : "  + LetterCountOne.LetterCountI("the dog and cat"));
//        System.out.println("SecondGreatLowTreeSet  : " + SecondGreatLowTreeSet.SecondGreatLow(new int[] {2,2,2,5,5,5,6}));
//        System.out.println("SecondGreatLow    : " + SecondGreatLow.SecondGreatLow(new int[] {2,2,2,5,5,5,6}));
//        System.out.println("DivisionStringifield :     " + DivisionStringified.DivisionStringified(1 , 10));
//        System.out.println("Counting minutes :            " + CountingMinutes.CountingMinutesI("1:00pm-11:00am"));
//        System.out.println("MeanMode:           " + MeanMode.MeanMode(new int[] {4, 4, 4, 6, 2}));
//        System.out.println("DashInsert:   " +  DashInsert.DashInsert("118981651"));
//        System.out.println("NumberAddition:          " + NumberAddition.NumberAddition("75Number9"));
//        System.out.println("AlphabetRunEncryptionSecond :" + AlphabetRunEncryptionSecond.AlphabetRunEncryption("bcdefghijklmnopqrstN"));
//        System.out.println("Fibo: " + Fibo.fibo(10));
//        System.out.println("FiboInt: "    + FiboInt.fiboint(10));
//        System.out.println("ThirdGreatest  : " +  ThirdGreatest.ThirdGreatest(new String[] {"bt","ct","mtyyyy"}));
//        System.out.println("Additive Persistence 4: " + AdditivePersistence.AdditivePersistence(4 ));
//        System.out.println("Additive Persistence 19: " + AdditivePersistence.AdditivePersistence(19 ));
//        System.out.println("Additive Persistence 2718: " + AdditivePersistence.AdditivePersistence(2718 ));
//        System.out.println("Additive Persistence 2567: " + AdditivePersistence.AdditivePersistence(2567 ));
//        System.out.println("Additive Persistence 199: " + AdditivePersistence.AdditivePersistence(199 ));
//        System.out.println("MultiplicativePersistence: " + MultiplicativePersistence.MultiplicativePersistence(25));
//        System.out.println("OffLineMinimum: " + OffLineMinimum.OffLineMinimum(new String[] {"5","4","6","E","1","7","E","E","3","2"}));
//        System.out.println("Superincreasing: " + Superincreasing.Superincreasing(new int[] {1, 3, 6, 13, 54}));
//        System.out.println("RectangleArea:  " + RectangleArea.RectangleArea( new String[] {"(0 0)", "(3 0)", "(0 2)", "(3 2)"}));
        System.out.println("TestTaker : " + TestTaker.newList(new String[]{"Denver Wagner 6 7 8", "Ernie Gibbs 11 2"}));

    }
}
