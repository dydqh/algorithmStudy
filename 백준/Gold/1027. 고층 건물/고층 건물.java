import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] height = new int[n];
        for(int i = 0 ; i < input.length ; i++){
            height[i] = Integer.parseInt(input[i]);
        }
        int answer = 0;
        for(int i = 0 ; i < n ; i++){
            int curAnswer = 0;
            double angle = -Integer.MAX_VALUE;
            for(int j = i - 1 ; j >= 0 ; j--){
                double curAngle = (double) (height[i] - height[j]) /(j - i);
                if(angle < curAngle){
                    angle = curAngle;
                    curAnswer++;
                }
            }
            angle = -Integer.MAX_VALUE;
            for(int j = i + 1 ; j < n ; j++){
                double curAngle = (double) (height[j] - height[i]) /(j - i);
                if(angle < curAngle){
                    angle = curAngle;
                    curAnswer++;
                }
            }
            answer = Math.max(answer, curAnswer);
        }
        System.out.println(answer);
    }
}