import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb = new StringBuffer();
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = a + b;
            sb.append(a).append(" + ").append(b).append(" = ").append(c);
            System.out.println(sb.toString());
        }
        catch(Exception e){
            
        }
    }
}