import java.io.*;

class Main{
    public static long[] value = new long[101];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < count ; i++){
            int N = Integer.parseInt(br.readLine());
            sb.append(tile(N)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static long tile(int N){
        value[0] = 1;
        value[1] = 1;
        value[2] = 1;
        value[3] = 2;
        value[4] = 2;
        value[5] = 3;
        value[6] = 4;
        value[7] = 5;

        for(int i = 8 ; i < N ; i++){
            value[i] = value[i - 1] + value[i - 5];
        }

        return value[N - 1];
    }
}