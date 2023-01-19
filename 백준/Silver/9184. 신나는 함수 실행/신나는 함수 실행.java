import java.io.*;

class Main{
    public static int[][][] abc = new int[21][21][21];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while(true){
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            int c = Integer.parseInt(input[2]);

            if(a == -1 && b == -1 && c == -1){
                break;
            }

            sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ").append(w(a, b, c)).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int w(int a, int b, int c){
        if(a <= 0 || b <= 0 || c <= 0){
            abc[0][0][0] = 1;
            return abc[0][0][0];
        }

        if(a > 20 || b > 20 || c > 20){
            abc[20][20][20] = w(20, 20, 20);
            return abc[20][20][20];
        }
        
        if(abc[a][b][c] != 0){
            return abc[a][b][c];
        }

        if(a < b && b < c){
            abc[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
            return abc[a][b][c];
        }
        else{
            abc[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
            return abc[a][b][c];
        }
    }
}