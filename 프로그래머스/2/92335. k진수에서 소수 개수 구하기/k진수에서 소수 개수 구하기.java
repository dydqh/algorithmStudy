import java.math.BigInteger;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            if(n % k == 0){
                if(sb.length() > 0){
                    answer = isAnswer(sb.reverse().toString()) ? answer + 1 : answer;
                    sb.setLength(0);
                }
            }
            else{
                sb.append(n % k);
            }
            n /= k;
        }
        if(sb.length() > 0){
            answer = isAnswer(sb.reverse().toString()) ? answer + 1 : answer;
        }

        return answer;
    }

    public static boolean isAnswer(String number){
        boolean result = !number.equals("1");
        BigInteger bigInteger = new BigInteger(number);
        for(int i = 2 ; i <= bigInteger.sqrt().intValue() ; i++){
            if(bigInteger.remainder(new BigInteger(String.valueOf(i))).doubleValue() == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}