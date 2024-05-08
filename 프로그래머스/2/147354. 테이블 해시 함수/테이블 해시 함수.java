import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        List<Node> list = new ArrayList<>();
        for (int[] item : data) {
            list.add(new Node(item, col - 1));
        }
        Collections.sort(list);
        int answer = 0;
        for(int i = row_begin - 1 ; i < row_end ; i++){
            int curMod = 0;
            for(int j = 0 ; j < data[i].length ; j++){
                curMod += list.get(i).row[j] % (i + 1);
            }
            answer = answer ^ curMod;
        }

        return answer;
    }

    public static class Node implements Comparable<Node>{
        private int[] row;
        private int col;

        public Node(int[] row, int col){
            this.row = row;
            this.col = col;
        }

        @Override
        public int compareTo(Node o){
            return o.row[col] != this.row[col] ? this.row[col] - o.row[col] : o.row[0] - this.row[0];
        }
    }
}