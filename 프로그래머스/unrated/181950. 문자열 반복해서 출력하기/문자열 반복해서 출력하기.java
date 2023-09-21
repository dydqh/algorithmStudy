import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[1]);
        
        for(int i = 0 ; i < count ; i++){
            sb.append(input[0]);
        }
        
        System.out.println(sb.toString());
    }
}