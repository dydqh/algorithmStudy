import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            int targetCount = Integer.parseInt(input[0]);
            
            for(int j = 0 ; j < input[1].length() ; j++){
                for(int k = 0 ; k < targetCount ; k++){
                    sb.append(input[1].charAt(j));
                }
            }
            
            sb.append('\n');
        }
        
        System.out.println(sb.toString());
    }
}