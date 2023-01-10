import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;
        int max = 0;
        int[] numberList = new int[count];
        int[] countList = new int[8001];

        for(int i = 0 ; i < count ; i++){
            int number = Integer.parseInt(br.readLine());
            sum += number;
            if(i == 0){
                min = number;
                max = number;
                countList[number + 4000] += 1;
            }
            else{
                min = number < min ? number : min;
                max = number > max ? number : max;
                countList[number + 4000] += 1;
            }
            numberList[i] = number;
        }

        Arrays.sort(numberList);

        int[] mode = new int[2];
        int modeCount = 0;
        boolean isTie = false;

        for(int i = min ; i <= max ; i++){
            int curN = i + 4000;
            if(i == min){
                mode[0] = i;
                modeCount = countList[curN];
            }
            else{
                if(countList[curN] > modeCount){
                    isTie = false;
                    mode[0] = i;
                    mode[1] = i;
                    modeCount = countList[curN];
                }
                else if(countList[curN] == modeCount){
                    if(!isTie){
                        isTie = true;
                        mode[1] = i;
                    }
                }
            }
        }
        if(min == max){
            mode[0] = min;
        }

        sb.append((int)Math.round((double)sum / count)).append("\n")
        .append(numberList[count / 2]).append("\n")
        .append(isTie ? mode[1] : mode[0]).append("\n")
        .append(max - min);

        System.out.println(sb.toString());
    }
}