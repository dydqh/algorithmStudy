import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int number = Integer.parseInt(br.readLine());
        int count = 1;
        int blank = number - 1;
        
        for(int i = 0 ; i < number - 1 ; i++){
            for(int j = 0 ; j < blank ; j++){
                sb.append(" ");
            }
            blank -= 1;
            
            for(int j = 0 ; j < count ; j++){
                sb.append("*");
            }
            count += 2;
            
            sb.append("\n");
        }
        
        for(int i = 0 ; i < number ; i++){
            for(int j = 0 ; j < blank ; j++){
                sb.append(" ");
            }
            blank += 1;
            
            for(int j = 0 ; j < count ; j++){
                sb.append("*");
            }
            count -= 2;
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}