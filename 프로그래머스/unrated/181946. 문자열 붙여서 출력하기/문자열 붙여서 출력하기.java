import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb = new StringBuffer();
            String[] input = br.readLine().split(" ");
            
            sb.append(input[0]).append(input[1]);
            
            System.out.println(sb.toString());
        }
        catch(Exception e){
            
        }
    }
}