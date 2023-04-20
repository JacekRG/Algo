import java.util.Arrays;

public class AlphabetRunEncryption {

        public static String AlphabetRunEncryption(String str) {

            char[] chars = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            StringBuilder finalSb = new StringBuilder();
            char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                    'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            for(char c : chars){
                if(c != 'R' && c != 'L' && c != 'S' && c != 'N'){
                    sb.append(c);
                } else sb.append(c).append(" ");
            }
            String[] encrWords = sb.toString().split(" ");
            System.out.println(Arrays.toString(encrWords));

            for(int i = 0; i < encrWords.length; i++){

                for( int j = 0; j < encrWords[i].length()-1; j++){

                    if(encrWords[i].contains("R")){

                    }

                }

            }


            return finalSb.toString();
        }

}
