class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        for(int i = 0 ; i < picture.length ; i++){
            StringBuffer sb = new StringBuffer();
            for(int j = 0 ; j < picture[i].length() * k ; j++){
                sb.append(picture[i].charAt(j / k));
            }
            for(int l = 0 ; l < k ; l++){
                answer[i * k + l] = sb.toString();
            }
            sb.setLength(0);
        }
        return answer;
    }
}