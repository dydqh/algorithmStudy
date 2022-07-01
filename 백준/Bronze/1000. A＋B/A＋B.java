import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		int num1 = Integer.parseInt(input.split(" ")[0]);
		int num2 = Integer.parseInt(input.split(" ")[1]);

		int num3 = num1 + num2;
		System.out.print(num3);
	}
}