import java.io.*;

class Main{
    public static boolean[][] star;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());
        star = new boolean[N][N];

        pattern(star, N, N);

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if(!star[i][j]){
                    sb.append("*");
                }
                else{
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void pattern(boolean[][] star, int N, int N2){
        if(N2 < 1){
            return;
        }
        pattern(star, N, N2 / 3);

        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                if((i / N2) % 3 == 1 && (j / N2) % 3 == 1){
                    star[i][j] = true;
                }
            }
        }
    }
}