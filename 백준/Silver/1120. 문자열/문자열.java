import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int min = input[1].length();
        int result = 0;

        for(int i = 0 ; i <= input[1].length() - input[0].length() ; i++){
            result = 0;

            for(int j = 0 ; j < input[0].length() ; j++){
                if(input[0].charAt(j) != input[1].charAt(j + i)){
                    result++;
                }
            }

            min = min > result ? result : min;
        }

        System.out.println(min);
    }
}