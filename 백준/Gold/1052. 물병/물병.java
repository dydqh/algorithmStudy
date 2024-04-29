import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int answer = 0;
        int curN = 1;

        while(curN != 0){
            curN = N + answer;
            int curK = 0;
            while(curN > 0 && curK <= K){
                if((curN & 1) == 1) curK++;
                curN = curN >> 1;
                if(curK > K){
                    curN = 1;
                }
            }
            answer++;
        }

        System.out.println(answer - 1);
    }
}