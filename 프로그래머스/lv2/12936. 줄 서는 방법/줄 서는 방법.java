import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        k--;

        int[] result = new int[n];
        List<Integer> list = new ArrayList<>();
        long count = 1;
        for(int i = 1 ; i <= n ; i++){
            list.add(i);
            count *= i;
        }

        for(int i = 0 ; i < n - 1 ; i++){
            count /= (n - i);
            int listIndex = (int)(k / count);
            k %= count;
            result[i] = list.get(listIndex);
            list.remove(listIndex);
        }

        result[n - 1] = list.get(0);
        return result;
    }
}