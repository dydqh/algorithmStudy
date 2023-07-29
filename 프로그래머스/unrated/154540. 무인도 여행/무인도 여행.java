import java.util.*;

class Solution {
    public int[] solution(String[] maps) {
        int[] dx = new int[]{1, 0, -1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        List<Integer> list = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();

        for(int i = 0 ; i < maps.length ; i++){
            for(int j = 0 ; j < maps[i].length() ; j++){
                if(maps[i].charAt(j) != 'X' && !visited[i][j]){
                    int curDate = 0;
                    queue.add(new int[]{j, i});
                    while(queue.size() > 0){
                        int[] curItem = queue.poll();
                        if(!visited[curItem[1]][curItem[0]]){
                            visited[curItem[1]][curItem[0]] = true;
                            curDate += (maps[curItem[1]].charAt(curItem[0]) - 48);
                            for(int k = 0 ; k < 4 ; k++){
                                if(check(maps, visited, curItem[0] + dx[k], curItem[1] + dy[k])){
                                    queue.add(new int[]{curItem[0] + dx[k], curItem[1] + dy[k]});
                                }
                            }
                        }
                    }
                    list.add(curDate);
                }
            }
        }

        if(list.size() == 0){
            return new int[]{-1};
        }
        else{
            return list.stream().mapToInt(i -> { return Integer.valueOf(i); }).sorted().toArray();
        }
    }

    public static boolean check(String[] maps, boolean[][] visited, int x, int y){
        if(x < 0 || y < 0 || x >= maps[0].length() || y >= maps.length){
            return false;
        }
        if(visited[y][x]){
            return false;
        }
        if(maps[y].charAt(x) == 'X'){
            return false;
        }
        return true;
    }
}