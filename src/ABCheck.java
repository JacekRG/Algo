public class ABCheck {

    public static String ABCheck(String str) {

        char[] chars = str.toCharArray();
        int aIdx = 0;
        int bIdx = 0;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'a'){
                aIdx = i;
                for(int j = 0; j<chars.length; j++){
                if(chars[j] == 'b'){
                    bIdx = j;
                    break;}
                };
            }
        }



        return String.valueOf(Math.abs(bIdx-aIdx) == 4);
    }
}
