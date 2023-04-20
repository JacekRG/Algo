public class SwapCase {

    public static String SwapCase(String str){

    char[] chars = str.toCharArray();
    StringBuilder sb = new StringBuilder();

    for(char c : chars){

        if(Character.isLowerCase(c)){
            sb.append(Character.toUpperCase(c));
        }

    }
    return sb.toString();
}

}
