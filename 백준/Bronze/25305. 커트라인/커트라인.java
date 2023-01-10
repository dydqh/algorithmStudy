import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int winner = Integer.parseInt(input[1]);
        int[] list = new int[count];

        String[] tempInput = br.readLine().split(" ");
        for(int i = 0 ; i < count ; i++){
            list[i] = Integer.parseInt(tempInput[i]);
        }

        Arrays.sort(list);
        System.out.println(list[count - winner]);
    }
}