import java.util.*;

public class Main {
    public static void main(String[] s) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int A = Integer.parseInt(input.split(" ")[0]);
        int B = Integer.parseInt(input.split(" ")[1]);

        sc.close();

        System.out.println(A > B ? ">" : A == B ? "==" : "<");
    }
}