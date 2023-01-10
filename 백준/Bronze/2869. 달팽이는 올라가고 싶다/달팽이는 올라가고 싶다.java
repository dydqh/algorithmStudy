import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int up = Integer.parseInt(input[0]);
        int down = Integer.parseInt(input[1]);
        int tree = Integer.parseInt(input[2]);
        
        System.out.println((int)Math.ceil((double)(tree - up) / (up - down)) + 1);
    }
}