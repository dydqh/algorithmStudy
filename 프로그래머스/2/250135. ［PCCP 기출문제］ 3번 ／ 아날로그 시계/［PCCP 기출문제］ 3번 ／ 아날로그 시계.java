class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int t1 = h1 * 3600 + m1 * 60 + s1;
        int t2 = h2 * 3600 + m2 * 60 + s2;
        int answer = 0;

        if(t1 == 0){
            answer++;
        }

        for(int i = t1 ; i < t2 ; i++){
            answer += check(i, i + 1);
        }

        long lastM = t2 / 3600 * 3600;
        long lastH = t2 / 43200 * 43200;
        answer += lastM == t2 ? 1 : 0;
        answer += lastH == t2 ? 1 : 0;
        answer -= lastM == t2 && lastM == lastH ? 1 : 0;

        return answer;
    }

    public static int check(long beforeSecond, long afterSecond){
        int curAnswer = 0;
        long curM = checkM(beforeSecond * 59, afterSecond * 59);
        long curH = checkH(beforeSecond * 719, afterSecond * 719);
        if(curM > 0) curAnswer++;
        if(curH > 0) curAnswer++;
        if(curM > 0 && curM == curH) curAnswer--;
        return curAnswer;
    }

    public static long checkM(long beforeSecond, long afterSecond){
        long checkSecond = afterSecond / 3600 * 3600;
        return checkSecond >= beforeSecond && checkSecond < afterSecond ? checkSecond * 719 : 0;
    }

    public static long checkH(long beforeSecond, long afterSecond){
        long checkSecond = afterSecond / 43200 * 43200;
        return checkSecond >= beforeSecond && checkSecond < afterSecond ? checkSecond * 59 : 0;
    }
}