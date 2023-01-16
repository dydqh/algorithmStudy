import java.io.*;

class Main{
    public static int[] arr;
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);
        
        arr = new int[M];

        dfs(N, M, 0, 1);

        System.out.println(sb.toString());
    }

    public static void dfs(int N, int M, int depth, int at) {
        if(M == depth){
            for(int item : arr){
                sb.append(item).append(" ");
            }
            sb.append("\n");
            return;
        }
        else{
            for(int i = at ; i <= N ; i++){
                arr[depth] = i;
                dfs(N, M, depth + 1, i);
            }
        }
    }
}