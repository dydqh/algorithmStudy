// import java.io.*;
// import java.util.*;

// class Main{
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuffer sb = new StringBuffer();

//         //String[] operations = new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
//         String[] operations = new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

//         Solution solution = new Solution();
//         int[] result = solution.solution(operations);
//         System.out.println(result[0]);
//         System.out.println(result[1]);
//     }
// }

// class Solution {
//     public int[] solution(String[] operations) {
//         PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
//         PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());

//         for(int i = 0 ; i < operations.length ; i++){
//             String[] operation = operations[i].split(" ");
//             int number = Integer.parseInt(operation[1]);
//             if(operation[0].equals("I")){
//                 priorityQueue1.add(number);
//                 priorityQueue2.add(number);
//             }
//             else if(operation[0].equals("D")){
//                 priorityQueue1.poll();
//                 priorityQueue2.poll();
//             }
//         }

//         return null;
//         // if(priorityQueue.size() == 0){
//         //     return new int[]{0, 0};
//         // }
//         // else{
//         //     return new int[]{priorityQueue.peek(), priorityQueue.peek()};
//         // }
//     }
// }

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
        bfs(R);

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

    public static void bfs(int R){
        Queue<Integer> queue = new LinkedList<>();
        int count = 1;
        result[R] = count;
        visited[R] = true;
        queue.add(R);
        count++;

        while(queue.size() > 0){
            int curR = queue.poll();
            ArrayList<Integer> curList = graph.get(curR);
            for(int i = 0 ; i < curList.size() ; i++){
                if(!visited[curList.get(i)]){
                    curR = curList.get(i);
                    queue.add(curR);
                    visited[curR] = true;
                    result[curR] = count;
                    count++;
                }
            }
        }
    }
}