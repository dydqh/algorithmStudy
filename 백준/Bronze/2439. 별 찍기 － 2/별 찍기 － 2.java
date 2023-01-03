import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < count ; i++){
            for(int j = 0 ; j < count - i - 1 ; j++){
                sb.append(" ");
            }
            for(int j = 0 ; j < i + 1 ; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}