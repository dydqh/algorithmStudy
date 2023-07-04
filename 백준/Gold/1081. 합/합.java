import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        long l = Long.parseLong(input[0]);
        long u = Long.parseLong(input[1]);
        long tempU = u;
        int uCount = 1;
        while(tempU > 9){
            tempU /= 10;
            uCount *= 10;
        }
        
        l = l > 0 ? l - 1 : 0;
        long tempL = l;
        int lCount = 1;
        while(tempL > 9){
            tempL /= 10;
            lCount *= 10;
        }

        System.out.println(cal(u, uCount) - cal(l, lCount));
    }

    public static long cal(long number, long target){
        if(number == 0){
            return 0;
        }

        long sum = 0;

        sum += ((number % target + 1) * (number / target));
        long tempNumber = number % target;
        int tempTarget = 1;
        while(tempNumber > 9){
            tempNumber /= 10;
            tempTarget *= 10;
        }
        sum += cal(number % target, tempTarget);
        sum += ((number / target) * cal(target - 1, target / 10));
        for(int i = 0 ; i < (number / target) ; i++){
            sum += (i * target);
        }

        return sum;
    }
}