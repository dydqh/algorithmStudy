import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");
            int large = Math.max(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            int small = Math.min(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
            int gcd = getGcd(large, small);
            int lcm = large * small / gcd;
            sb.append(lcm).append(" ").append(gcd).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getGcd(int large, int small){
        if(large % small == 0){
            return small;
        }
        else{
            return getGcd(small, large % small);
        }
    }
}
