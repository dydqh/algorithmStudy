import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            int A = Integer.parseInt(input.split(" ")[0]);
            int B = Integer.parseInt(input.split(" ")[1]);
            sb.append(A + B).append("\n");    
        }
        
        System.out.println(sb.toString());
    }
}