class Solution {
    public int solution(int[] arr) {
        int answer = calCount(arr[0]);

        for(int i = 1 ; i < arr.length ; i++){
            int curCalCount = calCount(arr[i]);
            answer = answer > curCalCount ? answer : curCalCount;
        }
        
        return answer;
    }

    public static int calCount(int n){
        int count = 0;
        int cur = n;
        int next = cal(cur); 

        while(cur != next){
            cur = next;
            next = cal(cur);
            count++;
        }

        return count;
    }

    public static int cal(int cur){
        return cur >= 50 && cur % 2 == 0 ? cur / 2 : (cur < 50 && cur % 2 == 1 ? cur * 2 + 1 : cur);
    }
}