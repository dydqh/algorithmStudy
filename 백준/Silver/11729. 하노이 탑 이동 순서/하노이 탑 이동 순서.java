import java.io.*;

class Main{
    public static StringBuffer sb = new StringBuffer();
    public static int K = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        hanoi(N, 1, 2, 3);

        System.out.println(K);
        System.out.println(sb.toString());
    }

    public static void hanoi(int N, int from, int by, int to){
        if(N == 1){
            sb.append(from).append(" ").append(to).append("\n");
            //System.out.println((N) + "번을 " + from + "에서 " + to);
            K += 1;
            return;
        }
        else{
            hanoi(N - 1, from, to, by);
            sb.append(from).append(" ").append(to).append("\n");
            //System.out.println((N) + "번을 " + from + "에서 " + to);
            hanoi(N - 1, by, from, to);
            K += 1;
        }
    }
}