import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int large = A > B ? A : B;
        int small = A > B ? B : A;
        
        int gcd = gcd(large, small);
        int lcm = A * B / gcd;
        sb.append(gcd).append("\n").append(lcm);
        System.out.println(sb.toString());
    }
    
    public static int gcd(int large, int small){
        if(large % small == 0){
            return small;
        }
        else{
            return gcd(small, large % small);
        }
    }
}