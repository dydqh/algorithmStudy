import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 1 ; i <= N ; i++){
            int curI = i;
            int M = i;
            while(curI > 0){
                M += curI % 10;
                curI /= 10;
            }
            if(M == N){
                System.out.println(i);
                break;
            }
            if(i == N){
                System.out.println("0");
                break;
            }
        }
    }
}