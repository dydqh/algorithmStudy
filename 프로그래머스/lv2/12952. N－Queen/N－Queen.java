class Solution {
    public static int[] rows;
    public static boolean[] visited;
    public static int answer;

    public int solution(int n) {
        rows = new int[n];
        visited = new boolean[n];
        answer = 0;

        dfs(n, 0, 0);
        
        return answer;
    }

    public static void dfs(int n, int row, int col){
        if(!check(row, col - 1)){
            return;
        }

        if(col == n){
            answer++;
            return;
        }
        

        for(int i = 0 ; i < n ; i++){
            if(!visited[i]){
                visited[i] = true;
                rows[col] = i;
                dfs(n, i, col + 1);
                visited[i] = false;
                rows[col] = 0;
            }
        }
    }

    public static boolean check(int row, int col){
        for(int i = 0 ; i < col ; i++){
            if(Math.abs(row - rows[i]) == col - i){
                return false;
            }
        }
        return true;
    }
}