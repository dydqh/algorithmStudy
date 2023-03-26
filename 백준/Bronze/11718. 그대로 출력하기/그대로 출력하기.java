import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while(true){
            String target = br.readLine();
            if(target == null){
                break;
            }
            sb.append(target).append("\n");
        }
        System.out.println(sb.toString());
    }
}