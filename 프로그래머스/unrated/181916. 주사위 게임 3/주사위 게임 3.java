class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] numbers = new int[]{a, b, c, d};
        int[] count = new int[7];
        int p = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            count[numbers[i]]++;
            p = count[numbers[i]] > count[p] ? numbers[i] : p;
        }
        
        int answer = 0;
        if(count[p] == 4){
            answer = p * 1111;
        }
        else if(count[p] == 3){
            int q = 0;
            for(int i = 1 ; i < 7 ; i++){
                if(count[i] == 1){
                    q = i;
                    answer = (10 * p + q) * (10 * p + q);
                    break;
                }
            }
        }
        else if(count[p] == 2){
            int q = 0;
            int r = 0;
            for(int i = 1 ; i < 7 ; i++){
                if(i == p){
                    continue;
                }
                else if(q == 0 && count[i] == 1){
                    q = i;
                }
                else if(count[i] == 1){
                    r = i;
                    answer = q * r;
                    break;
                }
                else if(count[i] == 2){
                    q = i;
                    answer = (p + q) * (int)Math.abs(p - q);
                    break;
                }
            }
        }
        else{
            for(int i = 1 ; i < 7 ; i++){
                if(count[i] == 1){
                    answer = i;
                    break;
                }
            }
        }
        
        return answer;
    }
}