import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int[] result = new int[count];
        int mod = Integer.parseInt(input[1]);
        String[] numberStrings = br.readLine().split(" ");
        result[0] = Integer.parseInt(numberStrings[0]) % mod;

        for(int i = 1 ; i < count ; i++){
            result[i] = (Integer.parseInt(numberStrings[i]) % mod + result[i - 1]) % mod;
        }

        long answer = 0;
        int[] mCount = new int[mod];

        for(int i = 0 ; i < count ; i++){
            if(result[i] == 0){
                answer++;
            }
             
            mCount[result[i]]++;
        }

        for(int i = 0 ; i < mod ; i++){
            answer += (long) mCount[i] * (mCount[i] - 1) / 2;
        }

        System.out.println(answer);
    }
}