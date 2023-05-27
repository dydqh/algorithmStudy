class Solution {
    public int[] solution(int n, int s) {
        if(n > s){
            return new int[]{-1};
        }

        int target = s;
        int[] answer = new int[n];

        for(int i = 0 ; i < n ; i++){
            answer[i] = s / n;
            target -= answer[i];
        }

        if(target > 0){
            for(int i = n - 1 ; i >= 0 ; i--){
                answer[i]++;
                target--;
                if(target == 0){
                    break;
                }
            }
        }

        return answer;
    }
}