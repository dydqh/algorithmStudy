import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] aList = br.readLine().split(" ");
        String[] bList = br.readLine().split(" ");
        int aScore = 0;
        int bScore = 0;
        String result = "D";
        for(int i = 0 ; i < aList.length ; i++){
            int curAScore = Integer.parseInt(aList[i]);
            int curBScore = Integer.parseInt(bList[i]);
            if(curAScore == curBScore){
                aScore += 1;
                bScore += 1;
            }
            else if(curAScore > curBScore){
                aScore += 3;
                result = "A";
            }
            else{
                bScore += 3;
                result = "B";
            }
        }
        if(aScore > bScore){
            result = "A";
        }
        else if(aScore < bScore){
            result = "B";
        }
        sb.append(aScore).append(" ").append(bScore).append("\n").append(result);
        System.out.println(sb.toString());
    }
}