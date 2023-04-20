public class NumberAddition {

    public static int NumberAddition(String str) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
            } else sb.append(" ");
        }
        String[] numbers = sb.toString().split(" ");
        for(String number : numbers){
            sum += Integer.parseInt(0 + number);
        }
        return sum;
    }
}
