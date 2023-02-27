import java.util.*;

class Solution
{
    /*
    public static boolean[] selectedA;
    public static boolean[] selectedB;
    public static int min = 1000001;
    public static int len;
    */
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);
        int answer = 0;
        
        for(int i = 0 ; i < A.length ; i++){
            answer += (A[i] * B[B.length - 1 - i]);
        }
        
        return answer;
        
        /*
        len = A.length;
        selectedA = new boolean[len];
        selectedB = new boolean[len];
        
        doCal(0, 0, A, B);

        return min;
        */
    }
    
    /*
    public static void doCal(int depth, int result, int[] A, int[] B){
        if(depth == len){
            min = min > result ? result : min;
            return;
        }
        
        for(int i = 0 ; i < len ; i++){
            if(!selectedA[i]){
                selectedA[i] = true;
                
                for(int j = 0 ; j < len ; j++){
                    if(!selectedB[j]){
                        selectedB[j] = true;
                        
                        doCal(depth + 1, result + (A[i] * B[j]), A, B);
                        
                        selectedB[j] = false;
                    }
                }
                
                selectedA[i] = false;
            }
        }
    }
    */
}