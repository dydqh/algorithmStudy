import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i++){
            Map<Integer, List<Integer>> in = new HashMap<>();
            Map<Integer, List<Integer>> out = new HashMap<>();
            String[] input = br.readLine().split(" ");
            int nodeCount = Integer.parseInt(input[0]);
            int caseCount = Integer.parseInt(input[1]);
            input = br.readLine().split(" ");
            int[] cost = new int[nodeCount + 1];
            for(int j = 1 ; j <= nodeCount ; j++){
                cost[j] = Integer.parseInt(input[j - 1]);
                in.put(j, new ArrayList<>());
                out.put(j, new ArrayList<>());
            }
            for(int j = 0 ; j < caseCount ; j++){
                input = br.readLine().split(" ");
                int start = Integer.parseInt(input[0]);
                int end = Integer.parseInt(input[1]);
                in.get(end).add(start);
                out.get(start).add(end);
            }
            Queue<Integer> queue = new LinkedList<>();
            int[] answer = new int[nodeCount + 1];
            for(int j = 1 ; j <= nodeCount ; j++){
                if(in.get(j).isEmpty()){
                    queue.add(j);
                    answer[j] = cost[j];
                }
            }

            while(!queue.isEmpty()){
                int cur = queue.poll();

                if(in.get(cur).isEmpty()){
                    for(int o : out.get(cur)){
                        in.get(o).remove(in.get(o).indexOf(cur));
                        answer[o] = Math.max(answer[cur] + cost[o], answer[o]);
                        if(in.get(o).isEmpty()){
                            queue.add(o);
                        }
                    }
                }
            }

            sb.append(answer[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb.toString());
    }
}