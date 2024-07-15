import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        List<Node> list = new ArrayList<>();
        for(int[] route : routes){
            list.add(new Node(route[0], route[1]));
        }
        Collections.sort(list);
        int end = list.get(0).end;
        for(Node route : list){
            if(route.start <= end){
                end = Math.min(route.end, end);
            }
            else{
                answer++;
                end = route.end;
            }
        }
        answer++;
        return answer;
    }

    public static class Node implements Comparable<Node> {
        private final int start;
        private final int end;

        public Node(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Node o){
            if(this.start != o.start){
                return this.start - o.start;
            }
            else{
                return o.end - this.end;
            }
        }
    }
}