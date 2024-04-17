import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] hList = new String[n];
        String[] vList = new String[n];
        Arrays.fill(vList, "");
        int h = 0;
        int v = 0;

        for(int i = 0 ; i < n ; i++){
            hList[i] = br.readLine();
            for(int j = 0 ; j < n ; j++){
                vList[j] += hList[i].substring(j, j + 1);
            }
        }

        for(int i = 0 ; i < n ; i++){
            String[] hSplit = hList[i].split("X");
            for (String s : hSplit) {
                if (s.length() >= 2) {
                    h++;
                }
            }

            String[] vSplit = vList[i].split("X");
            for (String s : vSplit) {
                if (s.length() >= 2) {
                    v++;
                }
            }
        }
        
        sb.append(h).append(" ").append(v);
        System.out.println(sb.toString());
    }
}