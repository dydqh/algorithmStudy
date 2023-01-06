import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[30];
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < 28 ; i++){
            int student = Integer.parseInt(br.readLine());
            students[student - 1] = true;
        }
        
        for(int i = 0 ; i < 30 ; i++){
            if(!students[i]){
                sb.append(i+1).append('\n');
            }
        }
        System.out.println(sb.toString());
    }
}