import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        Set<String> noHear = new HashSet<>();
        Set<String> noAll = new HashSet<>();

        for(int i = 0 ; i < N ; i++){
            noHear.add(br.readLine());
        }

        for(int i = 0 ; i < M ; i++){
            String temp = br.readLine();
            if(noHear.contains(temp)){
                noAll.add(temp);
            }
        }

        sb.append(noAll.size()).append("\n");
        List<String> sortedNoAll = noAll.stream().sorted().collect(Collectors.toList());
        for(int i = 0 ; i < sortedNoAll.size() ; i++){
            sb.append(sortedNoAll.get(i)).append("\n");
        }

        System.out.println(sb.toString());
    }
}