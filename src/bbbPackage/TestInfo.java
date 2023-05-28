package bbbPackage;

public class TestInfo {

    public static int testInfo(String text, String key){

        String finalText = text.toLowerCase();
        String finalKey = key.toLowerCase();

        int amount = 0;
        int currentIndex = finalText.indexOf(finalKey);

        while (currentIndex != -1){
            amount++;
            currentIndex = finalText.indexOf(finalKey, currentIndex + 1);
        }
        return  amount;
    }

    public static void main(String[] args) {
        System.out.println(testInfo("gitgdfscGITfdsfdscgItgdfscxzGItdv", "gIt"));
    }

}
