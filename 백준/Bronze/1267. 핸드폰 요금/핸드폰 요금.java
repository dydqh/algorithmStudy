import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int y = 0;
        int m = 0;
        for(String cur : input){
            int time = Integer.parseInt(cur);
            y += (time / 30 + 1) * 10;
            m += (time / 60 + 1) * 15;
        }
        System.out.println(m == y ? "Y M " + m : (m < y ? "M " + m : "Y " + y));
    }
}