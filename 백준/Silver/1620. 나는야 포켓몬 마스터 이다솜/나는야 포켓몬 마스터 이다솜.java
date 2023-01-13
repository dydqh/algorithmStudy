import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String[] stringList = new String[N + 1];
        Map<String, Integer> integerMap = new HashMap<>();

        for(int i = 1 ; i <= N ; i++){
            String temp = br.readLine();
            stringList[i] = temp;
            integerMap.put(temp, i);
        }

        for(int i = 0 ; i < M ; i++){
            String question = br.readLine();
            boolean isNumber = question.charAt(0) >= 48 && question.charAt(0) <= 57 ? true : false;

            if(isNumber){
                sb.append(stringList[Integer.valueOf(question)]).append("\n");
            }
            else{
                sb.append(integerMap.get(question)).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}