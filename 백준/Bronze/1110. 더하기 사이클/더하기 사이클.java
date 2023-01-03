import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int origin = Integer.parseInt(br.readLine());
        int count = 1;
        int target = (origin % 10 * 10) + ((origin / 10 + origin % 10) % 10);
        
        if(target == origin){
            System.out.println(count);
        }
        else{
            while(true){
                count += 1;    
                target = (target % 10 * 10) + ((target / 10 + target % 10) % 10);
                if(target == origin){
                    break;
                }
            }
            System.out.println(count);
        }
    }
}