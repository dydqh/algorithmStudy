import java.io.*;
import java.util.*;

class Main{
    public static ArrayList<ArrayList<Integer>> graph;
    public static boolean[] visited;
    public static int[] result;
    public static int N;
    public static int order = 1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        
        N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int R = Integer.parseInt(input[2]);
        visited = new boolean[N + 1];
        result = new int[N + 1];

        graph = new ArrayList<>();

        for(int i = 0 ; i <= N ; i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 1 ; i <= M ; i++){
            input = br.readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i = 1 ; i <= N ; i++){
            Collections.sort(graph.get(i));
        }

        visited[R] = true;
        dfs(R);

        for(int i = 1 ; i <= N ; i++){
            sb.append(result[i]).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void dfs(int R){
        result[R] = order;
        order++;

        ArrayList<Integer> curList = graph.get(R);
        for(int i = 0 ; i < curList.size() ; i++){
            if(!visited[curList.get(i)]){
                visited[curList.get(i)] = true;
                dfs(curList.get(i));
            }
        }
    }
}