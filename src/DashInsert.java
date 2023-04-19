public class DashInsert {

    public static String DashInsert(String str) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length()-1; i++){

            if(Integer.parseInt(String.valueOf(str.charAt(i))) %2 != 0
                    && Integer.parseInt(String.valueOf(str.charAt(i+1))) %2 != 0){
                sb.append(str.charAt(i));
                sb.append('-');
            } else sb.append(str.charAt(i));
        }
        sb.append(str.charAt(str.length()-1));

        return sb.toString();
    }

}
