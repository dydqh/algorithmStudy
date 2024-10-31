class Solution {
    public int[] solution(int[][] edges) {
        int N = 1000001;
        int[] in = new int[N];
        int[] out = new int[N];

        for (int[] edge : edges) {
            out[edge[0]]++;
            in[edge[1]]++;
        }

        int created = 0;
        int eight = 0;
        int bar = 0;

        for(int i = 0 ; i < N ; i++){
            if(out[i] >= 2) {
                if(in[i] == 0) {
                    created = i;
                }
                else{
                    eight++;
                }
            }else if(out[i] == 0 && in[i] > 0){
                bar++;
            }
        }

        return new int[]{created, out[created] - eight - bar, bar, eight};
    }
}