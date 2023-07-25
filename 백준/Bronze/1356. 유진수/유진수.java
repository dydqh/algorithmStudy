import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        boolean isTarget = false;
        while(n > 0){
            list.add(n % 10);
            n /= 10;
        }
        for(int i = 1 ; i < list.size() ; i++){
            isTarget = check(list, i);
            if(isTarget){
                break;
            }
        }

        if(isTarget){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
    public static boolean check(List<Integer> list, int i){
        long first = 1;
        long second = 1;

        for(int f = 0 ; f < i ; f++){
            first *= list.get(f);
        }

        for(int s = i ; s < list.size() ; s++){
            second *= list.get(s);
        }

        if(first == second){
            return true;
        }
        else{
            return false;
        }
    }
}