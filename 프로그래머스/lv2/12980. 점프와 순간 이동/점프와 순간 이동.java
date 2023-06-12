public class Solution {
    public int solution(int n) {
        int count = 1;

        while(n > 1){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                count++;
                n -= 1;
            }
        }
        
        return count;
    }
}