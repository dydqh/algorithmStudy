import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            int curNumber = Integer.parseInt(br.readLine());
            list.add(curNumber);
        }
        Collections.sort(list);

        int curGcd = list.get(1) - list.get(0);
        for(int i = 2 ; i < count ; i++){
            int curNumber = list.get(i) - list.get(i - 1);
            int large = curNumber > curGcd ? curNumber : curGcd;
            int small = curNumber + curGcd - large;
            curGcd = gcd(large, small);
        }

        System.out.println((list.get(count - 1) - list.get(0)) / curGcd - count + 1);
    }

    public static int gcd(int large, int small){
        while(small != 0){
            int temp = large;
            large = small;
            small = temp % small;
        }

        return large;
    }
}