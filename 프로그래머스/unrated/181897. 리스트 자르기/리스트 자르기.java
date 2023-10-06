import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        switch (n){
            case 1:
                answer = IntStream.rangeClosed(0, slicer[1]).map(i -> num_list[i]).toArray();
                break;
            case 2:
                answer = IntStream.range(slicer[0], num_list.length).map(i -> num_list[i]).toArray();
                break;
            case 3:
                answer = IntStream.rangeClosed(slicer[0], slicer[1]).map(i -> num_list[i]).toArray();
                break;
            case 4:
                answer = IntStream.rangeClosed(slicer[0], slicer[1]).filter(i -> (i - slicer[0]) % slicer[2] == 0).map(i -> num_list[i]).toArray();
                break;
            default:
                break;
        }
        return answer;
    }
}