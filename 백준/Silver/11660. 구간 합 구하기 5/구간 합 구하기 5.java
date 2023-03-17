import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] NM = br.readLine().split(" ");
        int N = Integer.parseInt(NM[0]);
        int M = Integer.parseInt(NM[1]);
        int[][] table = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            String[] input = br.readLine().split(" ");
            for(int j = 0 ; j < N ; j++){
                table[i][j] = Integer.parseInt(input[j]);
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 1 ; j < N ; j++){
                table[i][j] += table[i][j - 1];
            }
        }

        for(int i = 0 ; i < N ; i++){
            for(int j = 1 ; j < N ; j++){
                table[j][i] += table[j - 1][i];
            }
        }

        for(int i = 0 ; i < M ; i++){
            String[] input = br.readLine().split(" ");
            int x1 = Integer.parseInt(input[0]) - 1;
            int y1 = Integer.parseInt(input[1]) - 1;
            int x2 = Integer.parseInt(input[2]) - 1;
            int y2 = Integer.parseInt(input[3]) - 1;

            int cur = table[x2][y2];
            if(x1 > 0){
                cur -= table[x1 - 1][y2];
            }
            if(y1 > 0){
                cur -= table[x2][y1 - 1];
            }
            if(x1 > 0 && y1 > 0){
                cur += table[x1 - 1][y1 - 1];
            }
            sb.append(cur).append("\n");
        }

        System.out.println(sb.toString());
    }
}