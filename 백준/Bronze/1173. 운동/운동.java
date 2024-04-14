import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int M = Integer.parseInt(input[2]);
        int T = Integer.parseInt(input[3]);
        int R = Integer.parseInt(input[4]);
        int cur = m;
        int answer = 0;

        while(N > 0){
            if(cur + T <= M){
                cur += T;
                N--;
            }
            else {
                cur -= R;
                cur = Math.max(cur, m);
            }

            if(cur == m && answer == 0){
                answer = -1;
                break;
            }

            answer++;
        }
        System.out.println(answer);
    }
}