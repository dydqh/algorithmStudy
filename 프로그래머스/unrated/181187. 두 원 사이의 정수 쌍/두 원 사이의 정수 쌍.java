class Solution {
    public long solution(int r1, int r2) {
        long r2Count = 0;
        for(int i = 1 ; i < r2 ; i++){
            int max = (int)Math.sqrt(((long)r2 * r2) - ((long)i * i));
            r2Count += max;
        }
        r2Count *= 4;
        r2Count += (r2 * 4);
        
        long r1Count = 0;
        for(int i = 1 ; i < r1 ; i++){
            double maxDouble = Math.sqrt(((long)r1 * r1) - ((long)i * i));
            int maxInt = (int)Math.sqrt(((long)r1 * r1) - ((long)i * i));
            if(maxDouble == maxInt){
                r1Count += (maxInt - 1);
            }
            else{
                r1Count += maxInt;
            }
        }
        r1Count *= 4;
        r1Count += ((r1 - 1) * 4);
        
        return r2Count - r1Count;
    }
}        