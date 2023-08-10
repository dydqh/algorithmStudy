import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int aCount = Integer.parseInt(input[0]);
        int bCount = Integer.parseInt(input[1]);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        input = br.readLine().split(" ");
        for(int i = 0 ; i < aCount ; i++){
            a.add(Integer.parseInt(input[i]));
        }
        input = br.readLine().split(" ");
        for(int i = 0 ; i < bCount ; i++){
            b.add(Integer.parseInt(input[i]));
        }
        Collections.sort(a);
        Collections.sort(b);
        int aIndex = 0;
        int bIndex = 0;

        while(aIndex < aCount && bIndex < bCount){
            int curA = a.get(aIndex);
            int curB = b.get(bIndex);

            if(curA < curB){
                result.add(curA);
                aIndex++;
            }
            else if(curA == curB){
                aIndex++;
                bIndex++;
            }
            else{
                bIndex++;
            }
        }

        if(aIndex < aCount){
            while(aIndex < aCount){
                int curA = a.get(aIndex);
                result.add(curA);
                aIndex++;
            }
        }

        sb.append(result.size()).append("\n");
        if(result.size() > 0){
            for(int i = 0 ; i < result.size() ; i++){
                sb.append(result.get(i)).append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}