import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < number / 4 ; i++){
            sb.append("long ");
        }
        sb.append("int");
        
        System.out.println(sb.toString());
    }
}