import java.util.*;

class Solution {
    public static List<Integer[]> list = new ArrayList<>();

    public List<Integer[]> solution(int n) {
        hanoi(n, 1, 2, 3);
        return list;
    }

    public static void hanoi(int n, int start, int mid, int end){
        if(n == 1){
            list.add(new Integer[]{start, end});
            return;
        }

        hanoi(n - 1, start, end, mid);
        list.add(new Integer[]{start, end});
        hanoi(n - 1, mid, start, end);
    }
}