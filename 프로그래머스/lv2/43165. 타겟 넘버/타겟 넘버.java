class Solution {
    public static int[] result;
    public static boolean[] visited; 
    public static int N;
    public static int answer = 0;
    public static int T;
    
    public int solution(int[] numbers, int target) {
        N = numbers.length;
        T = target;

        result = new int[N];
        visited = new boolean[N];

        dfs(0, 0, numbers);
        
        return answer;
    }
    
    public static void dfs(int depth, int curNumber, int[] numbers){
        if(depth == N){
            if(curNumber == T){
                answer++;
            }
            return;
        }
        int newNumber = 0;

        for(int i = 0 ; i < 2 ; i++){
            if(!visited[depth]){
                visited[depth] = true;
                if(i == 0){
                    newNumber = curNumber + numbers[depth];
                }
                else if(i == 1){
                    newNumber = curNumber - numbers[depth];
                }
                dfs(depth + 1, newNumber, numbers);
                visited[depth] = false;
            }
        }
    }
}