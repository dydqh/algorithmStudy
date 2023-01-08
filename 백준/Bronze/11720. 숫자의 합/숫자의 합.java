import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int result = 0;
        
        for(int i = 0 ; i < count ; i++){
            result += (input.charAt(i) - 48);    
        }
        
        System.out.println(result);
    }
}