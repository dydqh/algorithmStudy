import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();

		double num1 = Integer.parseInt(input.split(" ")[0]);
		double num2 = Integer.parseInt(input.split(" ")[1]);

		double num3 = num1 / num2;
		System.out.print(num3);
	}
}