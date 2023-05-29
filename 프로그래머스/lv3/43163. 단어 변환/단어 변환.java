class Solution {
    public static boolean[] visited;
    public static int min = 0;

    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        for(int i = 0 ; i < words.length ; i++){
            if(find(begin, words[i])){
                visited[i] = true;
                dfs(words, i, target, 0);
            }
        }

        return min;
    }

    public static void dfs(String[] words, int index, String target, int count){
        String begin = words[index];
        count++;

        if(begin.equals(target)){
            min = min == 0 ? count : min;
            min = min > count ? count : min;
            return;
        }

        for(int i = 0 ; i < words.length ; i++){
            if(visited[i]){
                continue;
            }
            else if(find(begin, words[i])){
                visited[i] = true;
                dfs(words, i, target, count);
                visited[i] = false;
            }
        }
    }

    public static boolean find(String begin, String target){
        int count = 0;
        for(int i = 0 ; i < begin.length() ; i++){
            if(begin.charAt(i) != target.charAt(i)){
                count++;
            }
        }
        return count == 1 ? true : false;
    }
}