import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < players.length ; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0 ; i < callings.length ; i++){
            int beforeIndex = map.get(callings[i]);
            int afterIndex = beforeIndex - 1;
            String beforePlayer = players[beforeIndex];
            String afterPlayer = players[afterIndex];
            map.put(beforePlayer, afterIndex);
            map.put(afterPlayer, beforeIndex);
            players = change(players, beforeIndex, afterIndex);
        }
        
        return players;
    }
    
    public static String[] change(String[] players, int beforeIndex, int afterIndex){
        String temp = players[beforeIndex];
        players[beforeIndex] = players[afterIndex];
        players[afterIndex] = temp;
        return players;
    }
}