import java.util.*;

class Solution {
    public static Set<String> set = new HashSet<>();

    public int solution(String[] user_id, String[] banned_id) {
        boolean[] isVisited = new boolean[user_id.length];
        dfs(user_id, banned_id, isVisited, 0);
        return set.size();
    }

    public void dfs(String[] user_id, String[] banned_id, boolean[] isVisited, int depth){
        if(depth == banned_id.length){
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < user_id.length ; i++){
                if(isVisited[i]){
                    sb.append(user_id[i]).append(" ");
                }
            }
            set.add(sb.toString());
            return;
        }

        for(int i = 0 ; i < user_id.length ; i++){
            if(!isVisited[i]){
                if(user_id[i].length() == banned_id[depth].length()){
                    boolean isMatch = true;

                    for(int j = 0 ; j < user_id[i].length() ; j++){
                        if(banned_id[depth].charAt(j) != '*' && banned_id[depth].charAt(j) != user_id[i].charAt(j)){
                            isMatch = false;
                            break;
                        }
                    }

                    if(isMatch){
                        isVisited[i] = true;
                        dfs(user_id, banned_id, isVisited, depth + 1);
                        isVisited[i] = false;
                    }
                }
            }
        }
    }
}