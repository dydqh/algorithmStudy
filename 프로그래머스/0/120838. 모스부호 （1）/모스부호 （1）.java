import java.util.*;

class Solution {
    public String solution(String letter) {
        StringBuilder sb = new StringBuilder();
        String[] morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'".split(",");
        Map<String, String> map = new HashMap<>();
        for(String target : morse){
            String[] curTarget = target.split(":");
            map.put(curTarget[0].split("'")[1], curTarget[1].split("'")[1]);
        }
        for(String target : letter.split(" ")) {
            sb.append(map.get(target));
        }
        return sb.toString();
    }
}