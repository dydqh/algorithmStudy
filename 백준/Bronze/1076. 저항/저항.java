import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> value = new ArrayList<>();
        value.add("black");
        value.add("brown");
        value.add("red");
        value.add("orange");
        value.add("yellow");
        value.add("green");
        value.add("blue");
        value.add("violet");
        value.add("grey");
        value.add("white");

        long result = 0;
        result += (value.indexOf(br.readLine()) * 10);
        result += value.indexOf(br.readLine());
        int count = value.indexOf(br.readLine());
        for(int i = 0 ; i < count ; i++){
            result *= 10;
        }

        System.out.println(result);
    }
}