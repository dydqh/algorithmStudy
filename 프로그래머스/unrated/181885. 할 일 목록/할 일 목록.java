import java.util.stream.IntStream;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        return IntStream.range(0, todo_list.length).filter(i -> !finished[i]).mapToObj(i -> todo_list[i]).toArray(String[]::new);
    }
}