import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuffer sb = new StringBuffer();
            int input = Integer.parseInt(br.readLine());
            
            sb.append(input).append(" is ");
            if(input % 2 == 0){
                sb.append("even");
            }
            else{
                sb.append("odd");
            }
            
            System.out.println(sb.toString());
        }
        catch(Exception e){
            
        }
    }
}