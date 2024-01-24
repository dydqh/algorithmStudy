import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        List<String> what = Arrays.asList(new String[]{"code", "date", "maximum", "remain"});
        return Arrays.stream(data).filter(i -> i[what.indexOf(ext)] < val_ext).sorted((next, pre) -> next[what.indexOf(sort_by)] - pre[what.indexOf(sort_by)]).toArray(int[][]::new);
    }
}