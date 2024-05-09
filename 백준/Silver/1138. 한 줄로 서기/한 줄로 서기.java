import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] answer = new int[n];
        for(int i = 0 ; i < n ; i++){
            setAnswer(answer, input[i], i + 1);
        }
        for(int a : answer){
            sb.append(a).append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void setAnswer(int[] answer, String countString, int number){
        int count = Integer.parseInt(countString);
        for(int i = 0 ; i < answer.length ; i++){
            if(answer[i] == 0 && count == 0){
                answer[i] = number;
                break;
            }
            if(answer[i] == 0){
                count--;
            }
        }
    }
}