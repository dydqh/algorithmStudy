import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        List<String> result = new ArrayList<>();

        for(int i = 0 ; i < count ; i++){
            words.add(br.readLine());
        }

        Collections.sort(words, (next, pre) -> {
            if(next.length() > pre.length()){
                return -1;
            }
            else if(next.length() < pre.length()){
                return 1;
            }
            else{
                return 0;
            }
        });

        result.add(words.get(0));

        for(int i = 1 ; i < count ; i++){
            boolean isPossible = true;
            int curSize = result.size();
            for(int j = 0 ; j < curSize ; j++){
                if(result.get(j).startsWith(words.get(i))){
                    isPossible = false;
                    break;
                }
            }
            if(isPossible){
                result.add(words.get(i));
            }
        }

        System.out.println(result.size());
    }
}