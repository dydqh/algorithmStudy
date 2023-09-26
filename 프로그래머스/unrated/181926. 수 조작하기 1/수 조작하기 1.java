import java.util.stream.IntStream;

class Solution {
    int answer = 0;

    public int solution(int n, String control) {
        answer = n;
        
        IntStream.range(0, control.length()).forEach(idx -> {
            switch (control.charAt(idx)){
                case 'w':
                    answer++;
                    break;
                case 'a':
                    answer -= 10;
                    break;
                case 's':
                    answer--;
                    break;
                case 'd':
                    answer += 10;
                    break;
                default:
                    break;
            }
        });
        
        return answer;
    }
}