import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        List<Character> aList = new ArrayList<>();
        List<Character> bList = new ArrayList<>();
        for(int i = 0 ; i < a.length() ; i++){
            aList.add(a.charAt(i));
        }
        for(int i = 0 ; i < b.length() ; i++){
            char cur = b.charAt(i);
            if(aList.contains(cur)){
                aList.remove(aList.indexOf(cur));
            }
            else{
                bList.add(cur);
            }
        }
        System.out.println(aList.size() + bList.size());
    }
}