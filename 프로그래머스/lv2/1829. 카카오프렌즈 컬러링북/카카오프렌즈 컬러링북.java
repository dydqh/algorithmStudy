class Solution {
    public static int order;
    public static int max;
    public static int curMax;
    public static boolean[][] visited;
    public static int[][] parts;
    public static int[] dn = new int[]{-1, 0, 1, 0};
    public static int[] dm = new int[]{0, -1, 0, 1};
    
    public int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        parts = new int[m][n];
        order = 1;
        max = 0;

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(picture[i][j] != 0 && parts[i][j] == 0){
                    curMax = 0;
                    dfs(picture, i, j);
                    order++;
                    max = max > curMax ? max : curMax;
                }
            }
        }
        
        return new int[]{order - 1, max};
    }
    
    public static void dfs(int[][] picture, int m, int n){
        if(m < 0 || n < 0 || m >= picture.length || n >= picture[m].length){
            return;
        }

        if(parts[m][n] != 0){
            return;
        }

        parts[m][n] = order;
        curMax++;

        for(int i = 0 ; i < 4 ; i++){
            if(m + dm[i] < 0 || n + dn[i] < 0 || m + dm[i] >= picture.length || n + dn[i] >= picture[m].length){
                continue;
            }

            if(picture[m + dm[i]][n + dn[i]] == picture[m][n]){
                dfs(picture, m + dm[i], n + dn[i]);
            }
        }
    }
}