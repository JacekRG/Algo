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

        System.out.println("task2:        " + string);
        System.out.println("-------------------------");
        System.out.println("task2 simply: " + string2);
        System.out.println("**************************");
        System.out.println("Task 1:        " + arrayChallenge);
        System.out.println("-------------------------");
        System.out.println("Task 1 simply: " + arrayChallenge1);
        System.out.println("**************************");
        System.out.println("Task 3:          " + stringTimeChallenge);
        System.out.println("Task 3 MEINE:    " + meineTimeChallenge);
        System.out.println("Task 3 Final:    " + meineFinal);
        System.out.println("**************************");
        System.out.println("First Factorial: " + firstFactorial);
        System.out.println("Abelo: " + Abelo.FirstReverse("Motel"));
        System.out.println("LC:         :" + LetterChanges.LetterChanges("fun times!"));
        System.out.println("SimplySymbols:         :" + SimpleSymbols.simpleSymbols("2+a+a+"));

    }
}
