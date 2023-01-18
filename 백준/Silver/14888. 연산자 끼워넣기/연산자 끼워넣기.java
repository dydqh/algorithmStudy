import java.io.*;

class Main{
    public static int count;
    public static int[] numbers;
    public static int[] expressions = new int[4];
    public static int[] arr;
    public static int max = -1000000001;
    public static int min = 1000000001;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        count = Integer.parseInt(br.readLine());
        numbers = new int[count];
        String[] tempNumbers = br.readLine().split(" ");
        for(int i = 0 ; i < tempNumbers.length ; i++){
            numbers[i] = Integer.parseInt(tempNumbers[i]);
        }
        String[] tempExpressions = br.readLine().split(" ");
        for(int i = 0 ; i < tempExpressions.length ; i++){
            expressions[i] = Integer.parseInt(tempExpressions[i]);
        }
        arr = new int[count - 1];

        calculate(0);

        sb.append(max).append("\n").append(min);
        System.out.println(sb.toString());
    }

    public static void calculate(int depth){
        if(depth == (count - 1)){
            int target = numbers[0];
            for(int i = 0 ; i < arr.length ; i++){
                switch (arr[i]){
                    case 0:
                        target += numbers[i + 1];
                        break;
                    case 1:
                        target -= numbers[i + 1];
                        break;
                    case 2:
                        target *= numbers[i + 1];
                        break;
                    case 3:
                        target /= numbers[i + 1]; 
                    default:
                        break;
                }
            }
            max = target > max ? target : max;
            min = target < min ? target : min;

            return;
        }

        for(int i = 0 ; i < 4 ; i++){
            if(expressions[i] > 0){
                expressions[i] -= 1;
                arr[depth] = i;
                calculate(depth + 1);
                expressions[i] += 1;
            }
        }
    }

}