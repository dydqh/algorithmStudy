import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb = new StringBuffer();
            String input = br.readLine();
        
            for(int i = 0 ; i < input.length() ; i++){
                if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z'){
                    sb.append(String.valueOf(input.charAt(i)).toUpperCase());
                }
                else{
                    sb.append(String.valueOf(input.charAt(i)).toLowerCase());
                }
            }

            System.out.println(sb.toString());
        }
        catch(Exception e){

        }
    }
}