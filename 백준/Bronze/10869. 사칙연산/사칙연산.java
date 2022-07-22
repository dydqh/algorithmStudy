import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String input = br.readLine();

		int num1 = Integer.parseInt(input.split(" ")[0]);
		int num2 = Integer.parseInt(input.split(" ")[1]);

		int plus = num1 + num2;
		int minus = num1 - num2;
		int multi = num1 * num2;
		int div = num1 / num2;
		int remain = num1 % num2;

		bw.write(plus + "\n");
		bw.write(minus + "\n");
		bw.write(multi + "\n");
		bw.write(div + "\n");
		bw.write(remain + "\n");

		bw.flush();
	}
}