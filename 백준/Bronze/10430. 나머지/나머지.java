import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        sb.append((A + B) % C).append('\n');
        sb.append(((A % C) + (B % C)) % C).append('\n');
        sb.append((A * B) % C).append('\n');
        sb.append(((A % C) * (B % C)) % C).append('\n');

        System.out.println(sb.toString());
	}
}
