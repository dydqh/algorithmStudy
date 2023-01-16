import java.io.*;

class Main{
    public static int[] arr;
	public static boolean[] visit;
    public static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputNM = br.readLine().split(" ");
        int N = Integer.parseInt(inputNM[0]);
        int M = Integer.parseInt(inputNM[1]);
        
        arr = new int[M];
		visit = new boolean[N];
		dfs(N, M, 0);

        System.out.println(sb.toString());
    }

    public static void dfs(int N, int M, int depth) {
		if (depth == M) {
			for (int val : arr) {
                sb.append(val).append(" ");
			}
            sb.append("\n");
			return;
		}
 
		for (int i = 0; i < N; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(N, M, depth + 1);
				visit[i] = false;
			}
		}
	}
}