import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < count ; i++){
            String input = br.readLine();
            sb.append(Integer.parseInt(input.split(" ")[0]) + Integer.parseInt(input.split(" ")[1]))
                .append("\n");
        }
        
        System.out.println(sb.toString());
    }
}