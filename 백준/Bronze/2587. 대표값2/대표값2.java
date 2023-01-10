import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int[] list = new int[5];

        int sum = 0;
        for(int i = 0 ; i < 5 ; i++){
            int number = Integer.parseInt(br.readLine());
            list[i] = number;
            sum += number;
        }

        Arrays.sort(list);

        sb.append(sum / 5).append("\n").append(list[2]);
        System.out.println(sb.toString());
    }
}