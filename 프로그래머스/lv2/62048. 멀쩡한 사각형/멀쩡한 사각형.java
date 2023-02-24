class Solution {
    public long solution(int w, int h) {
        long origin = (long)w * h;

        int index = 0;
        int minus = 0;

        while(true){
            int minusCount = (int)Math.ceil((double)(index + 1) * h / w) - (int)Math.floor((double)index * h / w);
            minus += minusCount;
            if((int)((double)(index + 1) * h / w) == ((double)(index + 1) * h / w)){
                break;
            }
            index++;
        }

        long answer = origin - (w / (index + 1) * minus);
        
        return answer;
    }
}