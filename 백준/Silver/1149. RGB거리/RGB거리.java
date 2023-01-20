import java.io.*;

class Main{
    static int R = 0;
    static int G = 1;
    static int B = 2;
    static int N;
    static int[][] rgb;
    static int[][] sum;
    static int min = 1000001;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        rgb = new int[3][N];
        sum = new int[3][N];

        for(int i = 0 ; i < N ; i++){
            String[] temp = br.readLine().split(" ");
            rgb[R][i] = Integer.parseInt(temp[0]);
            rgb[G][i] = Integer.parseInt(temp[1]);
            rgb[B][i] = Integer.parseInt(temp[2]);
        }

        for(int i = 0 ; i < 3 ; i++){
            int result = dynamicMin(i, N - 1);
            min = min > result ? result : min;
        }
        
        System.out.println(min);
    }

    public static int dynamicMin(int color, int index){
        sum[R][0] = rgb[R][0];
        sum[G][0] = rgb[G][0];
        sum[B][0] = rgb[B][0];

        if(sum[color][index] == 0){
            if(color == R){
                int beforeMin = dynamicMin(G, index - 1) > dynamicMin(B, index - 1) ? dynamicMin(B, index - 1) : dynamicMin(G, index - 1);
                sum[R][index] = beforeMin + rgb[R][index];
            }
            else if(color == G){
                int beforeMin = dynamicMin(R, index - 1) > dynamicMin(B, index - 1) ? dynamicMin(B, index - 1) : dynamicMin(R, index - 1);
                sum[G][index] = beforeMin + rgb[G][index];
            }
            else if(color == B){
                int beforeMin = dynamicMin(R, index - 1) > dynamicMin(G, index - 1) ? dynamicMin(G, index - 1) : dynamicMin(R, index - 1);
                sum[B][index] = beforeMin + rgb[B][index];
            }
        }

        return sum[color][index];
    }
}