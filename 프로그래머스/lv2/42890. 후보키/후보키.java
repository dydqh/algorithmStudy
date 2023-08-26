import java.util.*;

class Solution { 
    public static List<String> list = new ArrayList<>();
    public static Set<String> set = new HashSet<>();
    public static boolean[] visited;

    public int solution(String[][] relation) {
        visited = new boolean[relation[0].length];

        for(int i = 0 ; i < relation[0].length ; i++){
            dfs(0, i + 1, relation, "");
        }
        
        return set.size();
    }

    public static void dfs(int start, int length, String[][] relation, String curString){
        if(length == curString.length()){
            if(!curString.equals("")){
                boolean isContinue = true;

                for(String item : set){
                    for(int i = 0 ; i < item.length() ; i++){
                        if(curString.indexOf(item.substring(i, i + 1)) == -1){
                            break;
                        }
                        else if(i == item.length() - 1){
                            isContinue = false;
                        }
                    }
                }

                if(isContinue){
                    boolean isSet = true;
                    for(int i = 0 ; i < relation.length ; i++){
                        StringBuffer sb = new StringBuffer();
                        for(int j = 0 ; j < curString.length() ; j++){
                            int curIndex = Integer.parseInt(curString.substring(j, j + 1));
                            sb.append(relation[i][curIndex]).append("_");
                        }
                        String curRelation = sb.toString();
                        if(list.indexOf(curRelation) == -1){
                            list.add(curRelation);
                        }
                        else{
                            isSet = false;
                            list.clear();
                            break;
                        }
                    }
                    list.clear();
                    
                    if(isSet){
                        set.add(curString);
                    }
                }
            }
        }

        for(int i = start ; i < relation[0].length ; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(i, length, relation, curString + String.valueOf(i));
                visited[i] = false;
            }
        }
    }
}