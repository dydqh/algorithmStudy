class Solution
{
    public int solution(int n, int a, int b)
    {
        int count = 0;
        
        while(a != b){
            count++;
            a += 1;
            a /= 2;
            b += 1;
            b /= 2;
        }

        return count;
    }
}