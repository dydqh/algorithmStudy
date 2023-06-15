import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        
        long result = 0;
        
        for(int i = 1 ; i <= n - 2 ; i++){
            result += (i * (n - i - 1));
        }
        
        System.out.println(result);
        System.out.println(3);
    }
}