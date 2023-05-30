class Solution {
    public static int count = 0;
    public static boolean[] visited = new boolean[8];
    public static char[] friends = new char[]{'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    public static char[] result = new char[8];
    
    public int solution(int n, String[] data) {
        count = 0;
        dfs(data, 0);
        return count;
    }
    
    public static void dfs(String[] data, int depth){
        if(depth == 8){
            if(isPossible(data, result)){
                count++;
            }
            return;
        }

        for(int i = 0 ; i < 8 ; i++){
            if(!visited[i]){
                visited[i] = true;
                result[depth] = friends[i];
                dfs(data, depth + 1);
                visited[i] = false;
            }
        }
    }

    public static boolean isPossible(String[] data, char[] result){
        for(int i = 0 ; i < data.length ; i++){
            int originIndex = 0;
            int targetIndex = 0;
            for(int j = 0 ; j < result.length ; j++){
                if(result[j] == data[i].charAt(0)){
                    originIndex = j;
                }
                if(result[j] == data[i].charAt(2)){
                    targetIndex = j;
                }
                if(originIndex != 0 && targetIndex != 0){
                    break;
                }
            }

            if((data[i].charAt(3) == '=' && Math.abs(targetIndex - originIndex) != (data[i].charAt(4) - 47))
            ||(data[i].charAt(3) == '>' && Math.abs(targetIndex - originIndex) <= (data[i].charAt(4) - 47))
            ||(data[i].charAt(3) == '<' && Math.abs(targetIndex - originIndex) >= (data[i].charAt(4) - 47))){
                return false;
            }
        }

        return true;
    }
}