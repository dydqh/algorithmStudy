import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        List[] graph = new List[n + 1];
        int min = n;
        for(int i = 1 ; i <= n ; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i = 0 ; i < wires.length ; i++){
            int[] wire = wires[i];
            graph[wire[0]].add(wire[1]);
            graph[wire[1]].add(wire[0]);
        }
        for(int i = 0 ; i < wires.length ; i++){
            int[] wire = wires[i];
            graph[wire[0]].remove(Integer.valueOf(wire[1]));
            graph[wire[1]].remove(Integer.valueOf(wire[0]));

            boolean[] visited = new boolean[n + 1];
            int part1 = check(graph, visited);
            int part2 = n - part1;

            min = Math.min(min , Math.abs(part1 - part2));

            graph[wire[0]].add(wire[1]);
            graph[wire[1]].add(wire[0]);
        }
        return min;
    }

    public static int check(List[] graph, boolean[] visited){
        int count = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while(!queue.isEmpty()){
            int startNode = queue.poll();
            for(int i = 0 ; i < graph[startNode].size() ; i++){
                int endNode = (int)graph[startNode].get(i);
                int b =3;
                if(!visited[endNode]){
                    queue.add(endNode);
                    visited[endNode] = true;
                    count++;
                }
            }
        }
        return count;
    }
}