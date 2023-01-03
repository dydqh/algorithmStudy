import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        while(true){
            String input = br.readLine();
            int A = Integer.parseInt(input.split(" ")[0]);
            int B = Integer.parseInt(input.split(" ")[1]);
            
            if(A == 0 && B == 0){
                break;
            }
            
            sb.append(A + B).append("\n");
        }
        
        System.out.println(sb.toString());
    }
}