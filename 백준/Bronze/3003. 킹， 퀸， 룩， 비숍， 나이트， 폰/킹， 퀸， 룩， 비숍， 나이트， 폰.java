import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer();
        
        int k = 1 - Integer.parseInt(input.split(" ")[0]);
        int q = 1 - Integer.parseInt(input.split(" ")[1]);
        int r = 2 - Integer.parseInt(input.split(" ")[2]);
        int b = 2 - Integer.parseInt(input.split(" ")[3]);
        int n = 2 - Integer.parseInt(input.split(" ")[4]);
        int p = 8 - Integer.parseInt(input.split(" ")[5]);
        
        sb.append(k + " ").append(q + " ").append(r + " ")
            .append(b + " ").append(n + " ").append(p);
        
        System.out.println(sb.toString());
    }
}