import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        while((input = br.readLine()) != null){
            int n = Integer.parseInt(input.split(" ")[0]);
            int k = Integer.parseInt(input.split(" ")[1]);
            int coupon = n;
            int answer = n;
            while(coupon >= k){
                int add = coupon / k;
                answer += add;
                coupon -= (add * k);
                coupon += add;
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb.toString());
    }
}