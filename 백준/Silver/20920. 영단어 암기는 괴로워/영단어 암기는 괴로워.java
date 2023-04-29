import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] input = br.readLine().split(" ");
        int count = Integer.parseInt(input[0]);
        int maxLength = Integer.parseInt(input[1]);
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < count ; i++){
            String curInput = br.readLine();
            if(curInput.length() < maxLength){
                continue;
            }

            set.add(curInput);

            if(!map.containsKey(curInput)){
                map.put(curInput, 1);
            }
            else{
                map.put(curInput, map.get(curInput) + 1);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (o1, o2) -> {
            if(map.get(o2) > map.get(o1)){
                return 1;
            }
            else if(map.get(o2) < map.get(o1)){
                return -1;
            }

            if(o2.length() > o1.length()){
                return 1;
            }
            else if(o2.length() < o1.length()){
                return -1;
            }
            
            return o1.compareTo(o2);
        });

        for(int i = 0 ; i < list.size() ; i++){
            sb.append(list.get(i)).append("\n");
        }

        System.out.println(sb.toString());
    }
}