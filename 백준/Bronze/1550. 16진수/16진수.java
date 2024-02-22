import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String input = br.readLine();
        int n = 0;
        for(int i = input.length() - 1 ; i >= 0 ; i--){
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'F'){
                answer += (input.charAt(i) - 55) * (int)Math.pow(16, n);
            }
            else{
                answer += (input.charAt(i) - 48) * (int)Math.pow(16, n);
            }
            n++;
        }
        System.out.println(answer);
    }
}