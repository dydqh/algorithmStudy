import java.io.*;

class Main{
    static int N;
    static int[][] numbers;
    static int[][] sum;
    static int result = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        numbers = new int[N][N];
        sum = new int[N][N];

        for(int i = 0 ; i < N ; i++){
            if(i == 0){
                numbers[i][0] = Integer.parseInt(br.readLine());
            }
            else{
                String[] temp = br.readLine().split(" ");
                for(int j = 0 ; j < temp.length ; j++){
                    numbers[i][j] = Integer.parseInt(temp[j]);
                }
            }
        }

        for(int i = 0 ; i < N ; i++){
            int curMax = calMax(N - 1, i);
            result = result < curMax ? curMax : result;
        }
        
        System.out.println(result);
    }

    public static int calMax(int floor, int index){
        if(floor == 0){
            sum[0][0] = numbers[0][0];
            return sum[0][0];
        }

        if(sum[floor][index] == 0){
            int beforeSum = 0;
            if(index == 0){
                for(int i = floor - 1 ; i >= 0 ; i--){
                    beforeSum += numbers[i][0];
                }
            }
            else if(index == floor){
                for(int i = floor - 1 ; i >= 0 ; i--){
                    beforeSum += numbers[i][i];
                }
            }
            else{
                beforeSum = Math.max(calMax(floor -1, index), calMax(floor -1, index - 1));
            }
            sum[floor][index] = beforeSum + numbers[floor][index];
        }

        return sum[floor][index];
    }
}