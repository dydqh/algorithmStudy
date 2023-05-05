import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[Integer.parseInt(input[0])];
        for(int i = 0 ; i < numbers.length ; i++){
            numbers[i] = i + 1;
        }
        int count = Integer.parseInt(input[1]);
        for(int i = 0 ; i < count ; i++){
            String[] curInput = br.readLine().split(" ");
            int begin = Integer.parseInt(curInput[0]);
            int end = Integer.parseInt(curInput[1]);
            int mid = Integer.parseInt(curInput[2]);
            numbers = swap(numbers, begin, end, mid);
        }

        for(int i = 0 ; i < numbers.length ; i++){
            sb.append(numbers[i]).append(" ");
        }

        System.out.println(sb.toString());
    }

    public static int[] swap(int[] arr, int begin, int end, int mid){
        int[] result = arr.clone();
        int index = mid - 1;
        for(int i = begin - 1 ; i < end ; i++){
             result[i] = arr[index];
             index++;
             if(index >= end){
                index = begin - 1;
             }
        }
        return result;
    }
}