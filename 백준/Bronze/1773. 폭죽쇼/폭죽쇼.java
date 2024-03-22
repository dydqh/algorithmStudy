import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        boolean[] isTime = new boolean[c + 1];
        for(int i = 0 ; i < n ; i++){
            int time = Integer.parseInt(br.readLine());
            for(int j = time ; j <= c ; j += time){
                isTime[j] = true;
            }
        }
        int answer = 0;
        for(int i = 0 ; i <= c ; i++){
            if(isTime[i]){
                answer++;
            }
        }
        System.out.println(answer);
    }
}