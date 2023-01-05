import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int index = 0;
        for(int i = 1 ; i <= 9 ; i++){
            int input = Integer.parseInt(br.readLine());
            if(i == 1){
                max = input;
                index = i;
            }
            else if(input > max){
                max = input;
                index = i;
            }
        }
        
        StringBuffer sb = new StringBuffer();
        sb.append(max).append("\n").append(index);
        System.out.println(sb.toString());
    }
}