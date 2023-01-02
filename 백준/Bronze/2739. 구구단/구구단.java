import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 1 ; i < 10 ; i++){
            sb.append(target).append(" * ").append(i).append(" = ").append(target * i).append("\n");
        }
        System.out.println(sb.toString());
    }
}