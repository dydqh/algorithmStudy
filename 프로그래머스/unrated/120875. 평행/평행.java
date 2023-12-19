class Solution {
    public int answer = 0;

    public int solution(int[][] dots) {
        boolean[] visited = new boolean[dots.length];
        int[] arr = new int[4];
        dfs(0, visited, arr, dots);
        return answer;
    }
    
    public void dfs(int depth, boolean[] visited, int[] arr, int[][] dots){
        if(depth == arr.length){
            if((double)(dots[arr[0]][0] - dots[arr[1]][0]) / (dots[arr[0]][1] - dots[arr[1]][1]) == (double)(dots[arr[2]][0] - dots[arr[3]][0]) / (dots[arr[2]][1] - dots[arr[3]][1])){
                answer = 1;
            }
            return;
        }
        for(int i = 0 ; i < visited.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                dfs(depth + 1, visited, arr, dots);
                visited[i] = false;
            }
        }
    }
}