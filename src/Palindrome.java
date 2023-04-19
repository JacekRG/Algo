public class Palindrome {

    public static boolean Palindrome(String str) {

        char[] chars = str.replaceAll("\\s+", "").toCharArray();
        int distance = Math.floorDiv(chars.length, 2);

        for (int i = 0; i<= distance; i++){
            if(chars[i] != chars[chars.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
