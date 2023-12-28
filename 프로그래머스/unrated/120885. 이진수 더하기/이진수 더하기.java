class Solution {
    public String solution(String bin1, String bin2) {
        StringBuffer sb = new StringBuffer();
        int answer = 0;
        for(int i = 0 ; i < bin1.length() ; i++){
            answer += Math.pow(2, i) * (bin1.charAt(bin1.length() - i - 1) == '0' ? 0 : 1);
        }
        for(int i = 0 ; i < bin2.length() ; i++){
            answer += Math.pow(2, i) * (bin2.charAt(bin2.length() - i - 1) == '0' ? 0 : 1);
        }
        if(answer == 0){
            sb.append("0");
        }
        while(answer > 0){
            sb.append(answer % 2);
            answer /= 2;
        }
        return sb.reverse().toString();
    }
}