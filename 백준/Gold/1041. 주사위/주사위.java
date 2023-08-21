import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        if(n == 1){
            int max = 0;
            int sum = 0;

            for(int i = 0 ; i < 6 ; i++){
                int curNumber = Integer.parseInt(input[i]);
                sum += curNumber;
                max = max > curNumber ? max : curNumber;
            }

            sum -= max;
            System.out.println(sum);
        }
        else{
            int minPoint = getMinPoint(input);
            int minLine = getMinLine(input);
            int min = getMin(input);
            long result = 0;
            result += (long)minPoint * 4;
            result += (long)minLine * 4;

            if(n == 2){
            }
            else{
                result += (long)(n - 2) * 8 * minLine;
                result += (long)(n - 2) * (n - 2) * min * 5;
                result += (long)(n - 2) * min * 4;
            }
            
            System.out.println(result);
        }
    }

    public static int getMinLine(String[] input){
        int minLine = 100;

        for(int i = 0 ; i < 6 ; i++){
            for(int j = i + 1 ; j < 6 ; j++){
                if(i + j == 5){
                    continue;
                }
                else{
                    int curLine = Integer.parseInt(input[i]) + Integer.parseInt(input[j]);
                    minLine = curLine < minLine ? curLine : minLine;
                }
            }
        }

        return minLine;
    }

    public static int getMinPoint(String[] input){
        int minPoint = 150;

        for(int i = 0 ; i < 6 ; i++){
            for(int j = i + 1 ; j < 6 ; j++){
                for(int k = j + 1 ; k < 6 ; k++){
                    if(i + j == 5 || i + k == 5 || j + k == 5){
                        continue;
                    }
                    else{
                        int curPoint = Integer.parseInt(input[i]) + Integer.parseInt(input[j]) + Integer.parseInt(input[k]);
                        minPoint = curPoint < minPoint ? curPoint : minPoint;
                    }
                }
            }
        }

        return minPoint;
    }

    public static int getMin(String[] input){
        int min = 50;

        for(int i = 0 ; i < 6 ; i++){
            int cur = Integer.parseInt(input[i]);
            min = cur < min ? cur : min;
        }

        return min;
    }
}
