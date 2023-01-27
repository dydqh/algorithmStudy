import java.io.*;

class Main{
    public static int[] score;
    public static int[] stairs;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stairs = new int[N];
        score = new int[N];

        if(N == 1){
            System.out.println(Integer.parseInt(br.readLine()));
        }
        else{
            for(int i = 0 ; i < N ; i++){
                stairs[i] = Integer.parseInt(br.readLine());
            }
    
            score[0] = stairs[0];
            score[1] = stairs[0] + stairs[1];
    
            System.out.println(cal(N - 1));
        }
    }

    public static int cal(int N){
        if(N < 0){
            return 0;
        }
        else if(N == 0){
            return score[0];
        }
        else if(N == 1){
            return score[1];
        }
        else if(score[N] != 0){
            return score[N];
        }
        
        for(int i = 2; i <= N ; i++){
            score[i] = Math.max(stairs[i] + stairs[i - 1] + cal(i - 3), stairs[i] + cal(i - 2));
        }
        return score[N];
    }
}