import java.util.*;

class Solution {
    //public static int[] arr;
    //public static int[] max;
    //public static boolean[] visited;
    //public static int N;
    //public static int answer = -1;
    
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i < clothes.length ; i++){
            String[] target = clothes[i];
            if(!map.containsKey(target[1])){
                List<String> list = new ArrayList<>();
                list.add(target[0]);
                map.put(target[1], list);
            }
            else{
                map.get(target[1]).add(target[0]);
            }
        }

        //N = map.size();
        //arr = new int[N];
        //max = new int[N];
        //visited = new boolean[N];
        //int index = 0;
        int answer = 1;
        
        for(String key : map.keySet()){
            //max[index] = map.get(key).size();
            //index++;
            answer *= (map.get(key).size() + 1);
        }
        
        //dfs(0);
        answer -= 1;
        
        return answer;
    }
    
//    public static void dfs(int depth){
//        if(depth == N){
//            answer += 1;
//            return;
//        }
//
//        for(int i = 0 ; i <= max[depth] ; i++){
//            if(!visited[depth]){
//                visited[depth] = true;
//                arr[depth] = i;
//                dfs(depth + 1);
//                arr[depth] = 0;
//                visited[depth] = false;
//            }
//        }
//    }
}