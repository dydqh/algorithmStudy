import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> dp = new ArrayList<>();

        if(n == 1){
            System.out.println(1);
        }
        else{
            if(n % 2 == 0){
                System.out.println(-1);
            }
            else if(n % 5 == 0){
                System.out.println(-1);
            }
            else{
                dp.add(n);
                while(true){
                    int curNumber = ((dp.get(dp.size() - 1) % n) * 10 + 1) % n;
                    if(curNumber == 0){
                        break;
                    }
                    dp.add(curNumber);
                }
                System.out.println(dp.size());
            }
        }
    }

    public static int cal(int n, int length){
        if(length == 2){
            return 11 % n;
        }
        else{
            return (cal(n, length - 1) * (10 % n)) % n + 1;
        }
    }
}