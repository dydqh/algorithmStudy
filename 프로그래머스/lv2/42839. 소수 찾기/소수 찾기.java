import java.util.*;

class Solution {
    public static int[] arr;
    public static boolean[] visited;
    public static int N;
    public static Set<Integer> result;
    public static String publicNumbers;
    public static boolean[] isPrime;
    
    public int solution(String numbers) {
        publicNumbers = numbers;
        N = numbers.length();
        arr = new int[N];
        visited = new boolean[N];
        result = new HashSet<>();
        int max = 1;
        for(int i = 0 ; i < N ; i++){
            max *= 10;
        }
        isPrime = new boolean[max];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2 ; i < Math.sqrt(max) ; i++){
            if(!isPrime[i]){
                continue;
            }
            
            int index = 2;
            while(i * index < max){
                isPrime[i * index] = false;
                index++;
            }
        }
        
        for(int i = 1 ; i <= N ; i++){
            calPrime(0, i);
        }
        
        return result.size();
    }
    
    public static void calPrime(int depth, int count){
        if(depth == N){
            String target = "";
            for(int i = 0 ; i < count ; i++){
                target += publicNumbers.charAt(arr[i]);
            }
            if(isPrime[Integer.valueOf(target)]){
                result.add(Integer.valueOf(target));
            }
            return;
        }
        
        for(int i = 0 ; i < N ; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i;
                calPrime(depth + 1, count);
                visited[i] = false;
            }
        }
    }
}