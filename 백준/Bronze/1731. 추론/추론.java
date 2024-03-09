import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        if(c - b == b - a){
            int q = c - b;
            int last = c;
            for(int i = 3 ; i < n ; i++){
                last = Integer.parseInt(br.readLine());
            }
            answer = last + q;
        }
        else{
            int q = c / b;
            int last = c;
            for(int i = 3 ; i < n ; i++){
                last = Integer.parseInt(br.readLine());
            }
            answer = last * q;
        }
        System.out.println(answer);
    }
}