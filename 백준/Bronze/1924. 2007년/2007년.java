import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int date = Integer.parseInt(input[1]);
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] result = new String[]{"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        for(int i = 0 ; i < month ; i++){
            date += days[i];
        }
        date += 6;
        date %= 7;

        System.out.println(result[date]);
    }
}