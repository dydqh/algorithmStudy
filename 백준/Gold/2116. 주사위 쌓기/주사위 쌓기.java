import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[][] dice = new String[count][6];
        for(int i = 0 ; i < count ; i++){
            dice[i] = br.readLine().split(" ");
        }

        int[] opposite = new int[]{5, 3, 4, 1, 2, 0};
        int max = 0;
        int curBottom = 0;
        int curTop = 0;

        for(int j = 0 ; j < 6 ; j++){
            int curMax = 0;

            for(int i = 0 ; i < count ; i++){
                if(i == 0){
                    curBottom = j;
                    curTop = opposite[j];
                }
                else{
                    curBottom = getIndex(dice[i], dice[i - 1][curTop]);
                    curTop = opposite[curBottom];
                }
                curMax += getMax(dice[i], curBottom, curTop);
            }

            max = max > curMax ? max : curMax;
        }
        
        System.out.println(max);
    }

    public static int getIndex(String[] dice, String target){
        int index = 0;

        for(int i = 0 ; i < 6 ; i++){
            if(dice[i].equals(target)){
                index = i;
                break;
            }
        }
        
        return index;
    }

    public static int getMax(String[] dice, int bottom, int top){
        int max = 0;

        for(int i = 0 ; i < 6 ; i++){
            if(i == bottom || i == top){
                continue;
            }
            int curNumber = Integer.parseInt(dice[i]);
            max = max > curNumber ? max : curNumber;
        }

        return max;
    }
}
