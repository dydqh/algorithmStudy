import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        while(N >= 1){
            int target = N % B;
            if(target > 9){
                target += 55;
                sb.append((char)target);
            }
            else{
                sb.append(target);
            }
            N /= B;
        }
        System.out.println(sb.reverse().toString());
    }
}