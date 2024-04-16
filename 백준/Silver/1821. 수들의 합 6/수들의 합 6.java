import java.io.*;

public class Main {
    public static String answer;
    public static boolean finish = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);
        dfs(new int[n], new boolean[n + 1], 0, target);
        System.out.println(answer);
    }

    public static void dfs(int[] arr, boolean[] visited, int depth, int target){
        if(depth == arr.length && !finish){
            int[] sum = arr.clone();
            for(int i = 0 ; i < depth - 1 ; i++){
                sum = sum(sum);
            }
            if(sum[0] == target){
                StringBuilder sb = new StringBuilder();
                for(int a : arr){
                    sb.append(a).append(" ");
                }
                answer = sb.toString();
                finish = true;
            }
        }

        for(int i = 1 ; i <= arr.length ; i++){
            if(!visited[i] && !finish){
                visited[i] = true;
                arr[depth] = i;
                dfs(arr, visited, depth + 1, target);
                arr[depth] = 0;
                visited[i] = false;
            }
        }
    }

    public static int[] sum(int[] arr){
        int[] sum = new int[arr.length - 1];
        for(int i = 0 ; i < arr.length - 1 ; i++){
            sum[i] = arr[i] + arr[i + 1];
        }
        return sum;
    }
}