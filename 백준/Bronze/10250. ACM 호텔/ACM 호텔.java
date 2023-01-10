import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < count ; i++){
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);

            int Y = N % H == 0 ? H : N % H;
            int X = (N - 1) / H + 1;
            sb.append(Y).append(X < 10 ? "0" + X : X).append("\n");
        }

        System.out.println(sb.toString());
    }
}