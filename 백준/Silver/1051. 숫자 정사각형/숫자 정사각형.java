import java.io.*;

public class Main {
    public static int max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        String[] arr = new String[row];
        for(int i = 0 ; i < row ; i++){
            arr[i] = br.readLine();
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                check(arr, max + 1, i, j);
            }
        }

        System.out.println(max * max);
    }

    public static void check(String[] arr, int size, int row, int col){
        int TL = arr[row].charAt(col);
        if(col + size - 1 < arr[row].length()){
            int TR = arr[row].charAt(col + size - 1);
            if(row + size - 1 < arr.length){
                int BL = arr[row + size - 1].charAt(col);
                int BR = arr[row + size - 1].charAt(col + size - 1);

                if(TL == TR && TL == BL && TL == BR){
                    max = size;
                }

                check(arr, size + 1, row, col);
            }
            else{
                return;
            }
        }
        else{
            return;
        }
    }
}