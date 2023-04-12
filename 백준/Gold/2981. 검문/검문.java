import java.io.*;
import java.util.*;

class Main{
    public static boolean[] isM;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        int[] numbers = new int[count];

        for(int i = 0 ; i < count ; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers);
        int gcd = numbers[1] - numbers[0];

        for(int i = 2 ; i < count ; i++){
            gcd = gcd(gcd, numbers[i] - numbers[i - 1]);
        }
        
        for(int i = 2 ; i <= gcd ; i++){
            if(gcd % i == 0){
                sb.append(i).append(" ");
            }
        }
        
        System.out.println(sb.toString());
    }

    public static int gcd(int large, int small){
        while(small != 0){
            int gcd = large % small;
            large = small;
            small = gcd;
        }

        return large;
    }
}