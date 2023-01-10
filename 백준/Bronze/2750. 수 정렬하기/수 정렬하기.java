import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        int[] list = new int[count];

        for(int i = 0 ; i < count ; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for(int i = 0 ; i < count ; i++){
            sb.append(list[i]).append("\n");
        }

        System.out.println(sb.toString());
    }
}