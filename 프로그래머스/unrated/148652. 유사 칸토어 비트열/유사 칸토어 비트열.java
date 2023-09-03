class Solution {
    public int solution(int n, long l, long r) {
        return cantor(n, l, r, 1);
    }

    public static int cantor(int n, long l, long r, long startIdx){
        if(n == 0){
            return 1;
        }

        long part = (long)Math.pow(5, n - 1);
        int result = 0;

        for(int i = 0 ; i < 5 ; i++){
            if(i == 2 || l >= startIdx + (part * (i + 1)) || r < startIdx + (part * i)){
                continue;
            }

            result += cantor(n - 1, l, r, startIdx + (part * i));
        }

        return result;
    }
}
