import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int result = 0;

        if(target == 1){
            result = 1;
        }
        else{
            int line = 0;
            int start = 2;
            while(true){
                int end = start + 5 + line * 6;
                if(target >= start && target <= end){
                    result = line + 2;
                    break;
                }
                line += 1;
                start = end + 1;
            }
        }
        
        System.out.println(result);
    }
}