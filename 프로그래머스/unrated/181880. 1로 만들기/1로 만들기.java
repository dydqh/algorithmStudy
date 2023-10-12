class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int i = 0 ; i < num_list.length ; i++){
            answer += getCount(num_list[i]);
        }
        return answer;
    }
    
    public static int getCount(int num){
        int count = 0;
        while(num > 1){
            if(num % 2 == 0){
                num /= 2;
            }
            else{
                num -= 1;
                num /= 2;
            }
            count++;
        }
        return count;
    }
}