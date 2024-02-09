import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int v = Integer.parseInt(input[0]);
        int e = Integer.parseInt(input[1]);
        List<List<Node>> graph = new ArrayList<>();
        int startNode = Integer.parseInt(br.readLine()) - 1;

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            input = br.readLine().split(" ");

            int start = Integer.parseInt(input[0]) - 1;
            int end = Integer.parseInt(input[1]) - 1;
            int weight = Integer.parseInt(input[2]);

            graph.get(start).add(new Node(end, weight));
        }

        for(int val : Dijkstra(startNode, v, graph)){
            sb.append(val != Integer.MAX_VALUE ? val : "INF").append("\n");
        }

        System.out.println(sb.toString());
    }

    private static int[] Dijkstra(int startNode, int v, List<List<Node>> graph) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        int[] distance = new int[v];
        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[startNode] = 0;
        pq.add(new Node(startNode, 0));

        while(!pq.isEmpty()){
            Node node = pq.poll();
            int nodeIndex = node.index;
            int nodeWeight = node.weight;

            if(nodeWeight > distance[nodeIndex]){
                continue;
            }

            for(Node graphNode : graph.get(nodeIndex)){
                if(nodeWeight + graphNode.weight < distance[graphNode.index]) {
                    //최단 테이블 갱신
                    distance[graphNode.index] = nodeWeight + graphNode.weight;
                    // 갱신 된 노드를 우선순위 큐에 넣어
                    pq.offer(new Node(graphNode.index, distance[graphNode.index]));
                }
            }
        }

        return distance;
    }

    private static class Node implements Comparable<Node> {
        private int index;
        private int weight;

        public Node(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        @Override
        public int compareTo(Node o){
            return this.weight - o.weight;
        }
    }
}