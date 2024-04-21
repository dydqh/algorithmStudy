import java.util.*;

class Solution {
        public static Map<String, Integer> map = new HashMap<>();
        public static List<String> list = new ArrayList<>();
        public String[] solution(String[] orders, int[] course) {
            for (int j : course) {
                for (String order : orders) {
                    dfs(0, order, new char[j], new boolean[order.length()], 0);
                }
                String[] temp = map.keySet().stream().filter(o -> map.get(o) >= 2).sorted((o1, o2) -> map.get(o2) - map.get(o1)).toArray(String[]::new);
                if(temp.length > 0){
                    int max = map.get(temp[0]);
                    int index = 0;
                    while(index < temp.length && map.get(temp[index]) == max){
                        list.add(temp[index]);
                        index++;
                    }
                    map.clear();
                }
            }
            String[] answer = list.stream().sorted().toArray(String[]::new);
            return answer;
        }

        public static void dfs(int start, String order, char[] arr, boolean[] visited, int depth){
            if(depth > order.length()){
                return;
            }
            else if(depth == arr.length){
                char[] temp = arr.clone();
                Arrays.sort(temp);
                String target = new String(temp);
                map.put(target, !map.containsKey(target) ? 1 : map.get(target) + 1);
                return;
            }

            for(int i = start ; i < order.length() ; i++){
                if(!visited[i]){
                    visited[i] = true;
                    arr[depth] = order.charAt(i);
                    dfs(i + 1, order, arr, visited, depth + 1);
                    visited[i] = false;
                }
            }
        }
    }