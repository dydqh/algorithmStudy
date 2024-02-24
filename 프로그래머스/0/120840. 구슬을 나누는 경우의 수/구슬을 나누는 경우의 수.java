import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger answer = new BigInteger("1");
        for(int i = balls ; i > balls - share ; i--){
            answer = answer.multiply(new BigInteger(String.valueOf(i)));
        }
        for(int i = share ; i > 1 ; i--){
            answer = answer.divide(new BigInteger(String.valueOf(i)));
        } 
        return answer.intValue();
    }
}