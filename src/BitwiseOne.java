public class BitwiseOne {

    public static String BitwiseOne(String[] strArr) {

        StringBuilder sb = new StringBuilder();

        String firstNumber = strArr[0];
        String secondNumber = strArr[1];

        for (int i = 0; i < strArr[0].length(); i++){
            if(firstNumber.charAt(i) == '1' || secondNumber.charAt(i) == '1'){
                sb.append("1");
            } else sb.append("0");
        }
        return sb.toString();
    }
}
