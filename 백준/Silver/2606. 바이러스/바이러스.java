import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 1 ; i <= node ; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i = 0 ; i < n ; i++){
            String[] input = br.readLine().split(" ");
            int l = Integer.parseInt(input[0]);
            int r = Integer.parseInt(input[1]);
            map.get(l).add(r);
            map.get(r).add(l);
        }
        boolean[] virused = new boolean[node + 1];
        int answer = 0;

        virused[1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while(!queue.isEmpty()){
            int curNode = queue.poll();
            for(int i : map.get(curNode)){
                if(!virused[i]){
                    answer++;
                    virused[i] = true;
                    queue.add(i);
                }
            }
        }

        System.out.println(answer);
    }
}