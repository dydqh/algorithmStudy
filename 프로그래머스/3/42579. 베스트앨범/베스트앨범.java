import java.util.*;

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        Map<String, Integer> totalPlay = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        List<Node> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i = 0 ; i < genres.length ; i++){
            if(!totalPlay.containsKey(genres[i])){
                totalPlay.put(genres[i], plays[i]);
            }
            else{
                totalPlay.put(genres[i], totalPlay.get(genres[i]) + plays[i]);
            }
        }
        for(int i = 0 ; i < genres.length ; i++){
            list.add(new Node(genres[i], plays[i], i, totalPlay.get(genres[i])));
        }
        Collections.sort(list);
        for(int i = 0 ; i < list.size() ; i++){
            if(!count.containsKey(list.get(i).genre)){
                count.put(list.get(i).genre, 1);
                answer.add(list.get(i).i);    
            }
            else{
                if(count.get(list.get(i).genre) < 2){
                    count.put(list.get(i).genre, 2);
                    answer.add(list.get(i).i);    
                }
            }
        }
        return answer;
    }
    
    public class Node implements Comparable<Node>{
        private int count;
        private String genre;
        private int play;
        private int i;
        
        public Node(String genre, int play, int i, int count){
            this.count = count;
            this.genre = genre;
            this.play = play;
            this.i = i;
        }
        
        @Override
        public int compareTo(Node o){
            if(o.count != this.count){
                return o.count - this.count;    
            }
            else{
                return o.play - this.play;
            }
        }
    }
}