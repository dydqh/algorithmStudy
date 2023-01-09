import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int fix = Integer.parseInt(input[0]);
        int minus = Integer.parseInt(input[1]);
        int plus = Integer.parseInt(input[2]);
        int result = 0;
        
        if(minus >= plus){
            result = -1;
        }
        else{
            int income = plus - minus;
            int count = 0;
            result = fix / income + 1;
        }
        System.out.println(result);
    }
}