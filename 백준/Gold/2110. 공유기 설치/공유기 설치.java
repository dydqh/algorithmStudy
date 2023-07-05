import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int[] list = new int[n];
        for(int i = 0 ; i < n ; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);

        int hi = list[n - 1] - list[0];
        int lo = 1;
        int mid = 0;

        if(c == 2){
            System.out.println(hi);
        }
        else{
            while(lo + 1 < hi){
                mid = (lo + hi) / 2;

                int curPoint = list[0];
                int targetPoint = list[0] + mid;
                int curC = 1;

                for(int i = 1 ; i < n ; i++){
                    if(list[i] >= targetPoint){
                        curPoint = list[i];
                        targetPoint = curPoint + mid;
                        curC++;
                    }
                }

                if(curC < c){
                    hi = mid;
                }
                else{
                    lo = mid;
                }
            }

            System.out.println(lo);
        }
    }
}