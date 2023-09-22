import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb = new StringBuffer();
            String input = br.readLine();
            
            for(int i = 0 ; i < input.length() ; i++){
                sb.append(input.charAt(i)).append("\n");
            }
            
            System.out.println(sb.toString());
        }
        catch(Exception e){
            
        }
    }
}