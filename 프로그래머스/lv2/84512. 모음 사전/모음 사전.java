import java.util.*;

class Solution {
    public static StringBuffer sb = new StringBuffer();
    public static char[] alphabet = new char[5];
    public static List<String> index = new ArrayList<>();
    public static char[] aeiou = new char[]{'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        setDic(0);
        return index.indexOf(word) + 1;
    }
    
    public static void setDic(int depth){
        if(depth > 0 && alphabet[depth - 1] != 0){
            for(int i = 0 ; i < 5 ; i++){
                if(alphabet[i] != 0){
                    sb.append(alphabet[i]);
                }
                else{
                    break;
                }
            }
            index.add(sb.toString());
            sb.setLength(0);
        }

        if(depth == 5){
            return;
        }

        for(int i = 0 ; i < 5 ; i++){
            alphabet[depth] = aeiou[i];
            setDic(depth + 1);
            alphabet[depth] = 0;
        }
    }
}