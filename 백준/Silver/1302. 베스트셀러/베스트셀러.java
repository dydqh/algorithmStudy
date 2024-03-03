import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> count = new HashMap<>();
        int max = 0;
        String maxBook = "";
        for(int i = 0 ; i < n ; i++){
            String book = br.readLine();
            if(!count.containsKey(book)){
                count.put(book, 1);
            }
            else{
                count.put(book, count.get(book) + 1);
            }
            int curCount = count.get(book);
            if(curCount > max){
                max = curCount;
                maxBook = book;
            }
            else if(curCount == max){
                if(book.compareTo(maxBook) < 0){
                    maxBook = book;
                }
            }
        }
        System.out.println(maxBook);
    }
}