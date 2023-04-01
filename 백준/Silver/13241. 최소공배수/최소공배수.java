import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long large = a > b ? a : b;
        long small = a > b ? b : a;
        long gcd = gcd(large, small);
        System.out.println(large * small / gcd);
    }
    
    public static long gcd(long large, long small){
        if(large % small == 0){
            return small;
        }
        else{
            return gcd(small, large % small);
        }
    }
}