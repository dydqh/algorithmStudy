import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int minSix = 1000;
        int minOne = 1000;

        for(int i = 0 ; i < m ; i++){
            input = br.readLine().split(" ");
            int curSix = Integer.parseInt(input[0]);
            int curOne = Integer.parseInt(input[1]);

            minSix = minSix > curSix ? curSix : minSix;
            minOne = minOne > curOne ? curOne : minOne;
        }

        int result = 0;

        if(minSix < (minOne * 6)){
            result = Math.min((((n / 6) + 1) * minSix), (((n / 6) * minSix) + ((n % 6) * minOne)));
        }
        else{
            result = (n) * minOne;
        }

        System.out.println(result);
    }
}