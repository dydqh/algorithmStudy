import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] aInput = br.readLine().split(" ");
        List<Integer> a = new ArrayList<>();
        String[] bInput = br.readLine().split(" ");
        List<Integer> b = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            a.add(Integer.parseInt(aInput[i]));
            b.add(Integer.parseInt(bInput[i]));
        }
        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());
        int answer = 0;
        for(int i = 0 ; i < n ; i++){
            answer += (a.get(i) * b.get(i));
        }
        System.out.println(answer);
    }
}